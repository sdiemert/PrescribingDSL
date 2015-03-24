package main;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class TitratingPrescriptionDose extends PrescriptionDose implements PrescriptionElement {
	private Dose startDose 				= null; 
	private Dose stopDose 				= null;
	private Dose amountChange 			= null; 
	private TimeUnit intervalTimeUnit 	= null; 
	private int intervalLength 			= 0; 

	public TitratingPrescriptionDose(Dose startDose, Dose stopDose, Dose amountChange, TimeUnit iTu, int iLength) {
		super(startDose.getAmount(), startDose.getUnit());
		this.startDose 			= startDose; 
		this.stopDose 			= stopDose; 
		this.intervalLength 	= iLength; 
		this.intervalTimeUnit 	= iTu; 
		this.amountChange 		= amountChange; 
	}

	public TitratingPrescriptionDose() {super();}

	@Override
	public Element toGrooveXML(Document doc, Element rootNode, int rxNumber, Element parent) {
		Element doseNode = null; 
		Element titratingNode = null; 
		
		int count = 0; 
		for(Dose d : this.doses){
			doseNode = (Element)GrooveXMLGenerator.GrooveXMLGeneratorUtils.addNode(doc, rootNode, "dosing"+rxNumber+"_"+count);
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, doseNode, "type:Dosing");
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, doseNode, "let:amount="+d.getAmount());
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, doseNode, "let:unit=\""+d.getUnit()+"\"");
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, doseNode, "let:n="+count);
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addEdgeNode(doc, rootNode, parent.getAttribute("id"), doseNode.getAttribute("id"), "dosing");

			titratingNode = (Element)GrooveXMLGenerator.GrooveXMLGeneratorUtils.addNode(doc, rootNode, "titratingDosing"+rxNumber+"_"+count); 
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc,  rootNode, titratingNode, "type:TitratingDosing");
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc,  rootNode, titratingNode, "let:change="+this.amountChange.getAmount()); 
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc,  rootNode, titratingNode, "let:interval="+this.intervalLength); 
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc,  rootNode, titratingNode, "let:intervalTimeUnit=\""+this.intervalTimeUnit+"\""); 
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addEdgeNode(doc, rootNode, doseNode.getAttribute("id"), titratingNode.getAttribute("id"), "titrating");
			count++; 
		}
		return null; 
	}

	@Override
	public Boolean sanityCheck() {
		return null;
	}

	public Dose getStartDose() {
		return startDose;
	}

	public void setStartDose(Dose startDose) {
		this.startDose = startDose;
	}

	public Dose getStopDose() {
		return stopDose;
	}

	public void setStopDose(Dose stopDose) {
		this.stopDose = stopDose;
	}

	public Dose getAmountChange() {
		return amountChange;
	}

	public void setAmountChange(Dose amountChange) {
		this.amountChange = amountChange;
	}

	public TimeUnit getIntervalTimeUnit() {
		return intervalTimeUnit;
	}

	public void setIntervalTimeUnit(TimeUnit intervalTimeUnit) {
		this.intervalTimeUnit = intervalTimeUnit;
	}

	public int getIntervalLength() {
		return intervalLength;
	}

	public void setIntervalLength(int intervalLength) {
		this.intervalLength = intervalLength;
	}
}
