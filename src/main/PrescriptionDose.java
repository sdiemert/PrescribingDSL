package main;

import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class PrescriptionDose implements PrescriptionElement{
	private Dose tempDose = null; 
	private ArrayList<Dose> doses = null; 
	
	/**
	 * @param amount : the number of units to give. Example 81 in "81 mg"
	 * @param unit : the unit of measure for the dose. 
	 */
	public PrescriptionDose(int amount, DoseUnit unit) {
		super();
		this.doses = new ArrayList<Dose>(); 
		this.tempDose = null; 
	}
	
	public PrescriptionDose(){
		super(); 
		this.doses = new ArrayList<Dose>(); 
		this.tempDose = null; 
	}
	
	public ArrayList<Dose> getDoses(){
		return this.doses; 
	}
	
	public void setAmount(int a){
		if(this.tempDose == null){
			this.tempDose = new Dose(); 
			this.tempDose.setAmount(a);
		}else if(this.tempDose.getAmount() == 0){
			this.tempDose.setAmount(a); 
			if(this.tempDose.getUnit() != null){
				this.doses.add(this.tempDose);
				this.tempDose = null;
			}
		}
	}
	
	public void setUnit(DoseUnit u){
		if(this.tempDose == null){
			this.tempDose = new Dose(); 
			this.tempDose.setUnit(u);
		}else if(this.tempDose.getUnit() == null){
			this.tempDose.setUnit(u); 
			if(this.tempDose.getAmount() != 0){
				this.doses.add(this.tempDose);
				this.tempDose = null;
			}
		}
	}

	@Override
	public String toString() {
		String s = "";
		s ="PrescriptionDose ["; 
		for(Dose d : this.doses){
				s+="{amount=" + d.getAmount()+ ", unit=" + d.getUnit()+ "}, ";
		}
		s+="]"; 
		return s; 
	}

	public Element toGrooveXML(Document doc, Element rootNode, int rxNumber){
		Element doseElement = null; 
		Element dosingElem = (Element)GrooveXMLGenerator.GrooveXMLGeneratorUtils.addNode(doc, rootNode, "prescriptionDose"+rxNumber);
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, dosingElem, "type:Dosing");

		for(int i = 0; i < this.doses.size(); i++){
			doseElement = (Element)GrooveXMLGenerator.GrooveXMLGeneratorUtils.addNode(doc, rootNode, "prescriptionDose"+rxNumber+i);
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc,rootNode, doseElement, "let:amount="+this.doses.get(i).getAmount());
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, doseElement, "let:unit=\""+this.doses.get(i).getUnit()+"\"");
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, doseElement, "let:n="+Integer.toString(i));
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, doseElement, "type:Dose");
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addEdgeNode(doc, rootNode, dosingElem.getAttribute("id"), doseElement.getAttribute("id"), "dose");
		}
		return dosingElem;
	}

	@Override
	public Boolean sanityCheck() {
		return true;
	}

	public void addDose(Dose dose) {
		this.doses.add(dose); 
	} 
	
	
	
}
