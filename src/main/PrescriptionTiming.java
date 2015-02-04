package main;

import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class PrescriptionTiming implements PrescriptionElement{
	
	private int frequency;
	private int duration; 
	private TimeUnit unit; //this unit is the one we ideally use.
	private TimeUnit freqUnit;
	private TimeUnit durationUnit;
	private ArrayList<Integer> instants = null; 

	/**
	 * 
	 * @param frequency
	 * @param duration
	 * @param unit
	 * @param hours - a list of the hours at which the medication 
	 * 					actions are to be taken
	 */
	public PrescriptionTiming(int frequency, int duration,
			TimeUnit unit, ArrayList<Integer> instants) {
		super();
		this.frequency = frequency;
		this.duration = duration;
		this.unit = unit;
		this.instants = instants; 
	}
	/**
	 * @param frequency
	 * @param duration
	 * @param unit
	 */
	public PrescriptionTiming(int frequency, int duration,
			TimeUnit unit) {
		super();
		this.frequency = frequency;
		this.duration = duration;
		this.unit = unit;
		this.instants = new ArrayList<Integer>(); 
	}
	
	public PrescriptionTiming(){
		this.frequency = 0;
		this.unit = null;
		this.duration = 0; 
		this.instants = new ArrayList<Integer>(); 
	}

	/**
	 * Adds an hour to the hours list. Checks to make sure the hour is not already 
	 * in the list. 
	 * @param h - the hour to add, and integer between 0 and 23.
	 * @throws IllegalArgumentException if the value of h is an invalid instant. 
	 * @throws ArrayStoreException if the value is already in the instants array.
	 */
	public void addInstant(int h) throws IllegalArgumentException, ArrayStoreException{
		if(this.freqUnit == TimeUnit.DAY){
			if(h > 23 || h < 0){ //check to make sure that hours are valid. 
				throw new IllegalArgumentException("Hours must be between 0 and 23"); 
			}
		}else if(this.freqUnit == TimeUnit.WEEK){
			if(h > 7 || h < 1){
				throw new IllegalArgumentException("Days of week must be between 1 and 7"); 
			}
		}else if(this.freqUnit == TimeUnit.MONTH){
			if(h > 28 || h < 1){
				throw new IllegalArgumentException("Days of month must be between 1 and 28"); 
			}
		}else{
			throw new IllegalArgumentException("Unsupported time unit: "+this.freqUnit); 
		}

		if(this.instants.contains(h)){
			throw new ArrayStoreException("The value" +h+" is already in the array");
		}else{
			this.instants.add(h); 
		}
	}
	
	public ArrayList<Integer> getInstants(){
		return this.instants; 
	}
	
	public TimeUnit getFreqUnit() {
		return freqUnit;
	}
	public void setFreqUnit(TimeUnit freqUnit) {
		this.freqUnit = freqUnit;
	}
	public TimeUnit getDurationUnit() {
		return durationUnit;
	}
	public void setDurationUnit(TimeUnit durationUnit) {
		this.durationUnit = durationUnit;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public TimeUnit getUnit() {
		return unit;
	}
	public void setUnit(TimeUnit unit) {
		this.unit = unit;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "PrescriptionTiming [frequency=" + frequency 
				+ ", duration=" + duration + ", unit=" + unit + ", hours="+this.instants+"]";
	}

	@Override
	public Element toGrooveXML(Document doc, Element rootNode, int rxNumber) {
        Element newNode = (Element)GrooveXMLGenerator.GrooveXMLGeneratorUtils.addNode(doc, rootNode, "prescriptionTiming"+rxNumber); 
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc,  rootNode, newNode, "let:duration="+this.getDuration());
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc,  rootNode, newNode, "let:unit=\""+this.getUnit()+"\""); GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc,  rootNode, newNode, "let:frequency="+this.getFrequency());
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, newNode, "type:Timing");
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, newNode, "let:order=0");
		
		Element timeNode = null; 
		for(Integer i : this.instants){
			timeNode = (Element)GrooveXMLGenerator.GrooveXMLGeneratorUtils.addNode(doc, rootNode, "instant"+i); 
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc,  rootNode, timeNode, "let:instant="+i);
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc,  rootNode, timeNode, "type:Instant");
			System.out.println(timeNode.getAttribute("id")); 
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.addEdgeNode(doc, rootNode, newNode.getAttribute("id"), timeNode.getAttribute("id"), "instant");
		}
		
		return newNode;
	}
}
