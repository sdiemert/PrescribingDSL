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
		Element newNode = (Element)GrooveXMLGenerator.GrooveXMLGeneratorUtils.addNode(doc, rootNode, "prescriptionDose"); 
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc,  rootNode, newNode, "type:TitratingDosing");
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc,  rootNode, newNode, "let:change="+this.amountChange.getAmount()); 
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc,  rootNode, newNode, "let:interval="+this.intervalLength); 
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc,  rootNode, newNode, "let:intervalTimeUnit=\""+this.intervalTimeUnit+"\""); 
		
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
