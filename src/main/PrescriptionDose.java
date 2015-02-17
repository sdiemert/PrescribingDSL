package main;

import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class PrescriptionDose implements PrescriptionElement{
	private Dose tempDose = null; 
	private ArrayList<Dose> doses = null; 
	private int change = 0;  //the amount to change the dose by per unit of time, used by tapering prescriptions
	
	/**
	 * @param amount : the number of units to give. Example 81 in "81 mg"
	 * @param unit : the unit of measure for the dose. 
	 */
	public PrescriptionDose(int amount, DoseUnit unit) {
		super();
		this.doses = new ArrayList<Dose>(); 
		this.doses.add(new Dose(amount, unit)); 
		this.tempDose = null; 
		this.change=0;
	}
	
	public PrescriptionDose(){
		super(); 
		this.doses = new ArrayList<Dose>(); 
		this.tempDose = null; 
		this.change=0;
	}

	public PrescriptionDose(int change){
		super(); 
		this.doses = new ArrayList<Dose>(); 
		this.tempDose = null; 
		this.change=change;
	}
	
	public ArrayList<Dose> getDoses(){
		return this.doses; 
	}
	
	public void setAmount(int a) throws Exception{
		if(this.tempDose == null){
			this.tempDose = new Dose(); 
			this.tempDose.setAmount(a);
		}else if(this.tempDose.getAmount() == 0){
			this.tempDose.setAmount(a); 
			if(this.tempDose.getUnit() != null){
				this.addDose(this.tempDose);
				this.tempDose = null;
			}
		}
	}
	
	public void setUnit(DoseUnit u) throws Exception{
		if(this.tempDose == null){
			this.tempDose = new Dose(); 
			this.tempDose.setUnit(u);
		}else if(this.tempDose.getUnit() == null){
			this.tempDose.setUnit(u); 
			if(this.tempDose.getAmount() != 0){
				this.addDose(this.tempDose);
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
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, dosingElem, "let:int:change="+this.change);

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

	public void addDose(Dose dose) throws Exception{
		if(this.change != 0 && (dose.getAmount() != this.doses.get(0).getAmount() || dose.getUnit() != this.doses.get(0).getUnit())){
			throw new Exception("Cannot add varying doses if change is non-zero");
		}else{
			this.doses.add(dose); 
		}
	} 
	
	
	
}
