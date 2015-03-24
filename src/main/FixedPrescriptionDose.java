package main;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class FixedPrescriptionDose extends PrescriptionDose implements PrescriptionElement {

	public FixedPrescriptionDose(int amount, DoseUnit unit) {
		super(amount, unit);
	}

	public FixedPrescriptionDose() {
		super(); 
	}

	@Override
	public Element toGrooveXML(Document doc, Element rootNode, int rxNumber) {
		Element newNode = (Element)GrooveXMLGenerator.GrooveXMLGeneratorUtils.addNode(doc, rootNode, "prescriptionDose"+rxNumber); 
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc,  rootNode, newNode, "type:FixedDosing");
		
		Element doseNode = null; 
		
		int count = 0; 
		for(Dose d : this.doses){
			doseNode = (Element)GrooveXMLGenerator.GrooveXMLGeneratorUtils.addNode(doc, rootNode, "dose"+rxNumber+"_"+count);
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, doseNode, "type:Dose");
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, doseNode, "let:amount="+d.getAmount());
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, doseNode, "let:unit=\""+d.getUnit()+"\"");
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, doseNode, "let:n="+count);
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addEdgeNode(doc, rootNode, newNode.getAttribute("id"), doseNode.getAttribute("id"), "dose");
			count++; 
		}
		return newNode; 
	}

	@Override
	public Boolean sanityCheck() {
		return null;
	}
}
