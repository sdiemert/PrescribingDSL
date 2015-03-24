/**
 * Main model object for the Rx Graph Model. 
 * 
 * This combines the main components of the data model, namely:
 *  - Action
 *  - Medication
 *  - Dose
 *  - Timing
 *  - Repeats
 */

package main;

import org.w3c.dom.Element;
import org.w3c.dom.Document;

/**
 * @author sdiemert
 */
public class Prescription implements PrescriptionElement{
	
	private PrescriptionTiming timing; 
	private PrescriptionDose dose;
	private PrescriptionAction action; 
	private String medication;
	private int repeats;
	
	/**
	 * Creates a new Prescription object.
	 * 
	 * @param timing: object that describes the timing of the prescription
	 * @param dose: dose object of the prescription
	 * @param action: to undertake 
	 * @param medication:  substance to be acted on
	 * @param repeats: the number of times to repeat this prescription
	 */
	public Prescription(PrescriptionTiming timing, PrescriptionDose dose, PrescriptionAction action, String medication, int repeats){
		this.timing = timing;
		this.dose = dose;
		this.action = action;
		this.medication = medication; 
		this.repeats = repeats; 
	}
	
	/**
	 * Creates a new empty prescription object with all fields set to null or zero. 
	 */
	public Prescription(){
		this.timing = null; 
		this.dose = null;
		this.action = null;
		this.medication = null;
		this.repeats = 0; 
	}
	
	/** Getters and Setters **/ 
	public PrescriptionTiming getTiming() {
		return timing;
	}
	public void setTiming(PrescriptionTiming timing) {
		this.timing = timing;
	}
	public PrescriptionDose getDose() {
		return dose;
	}
	public void setDose(PrescriptionDose dose) {
		this.dose = dose;
	}
	public PrescriptionAction getAction() {
		return action;
	}
	public void setAction(PrescriptionAction action) {
		this.action = action;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}
	public void setRepeats(int repeats) {
		this.repeats = repeats;
	}

	/**
	 * Outputs a string representation of the prescription.
	 */
	@Override
	public String toString() {
		return "Prescription [timing=" + timing + ", dose=" + dose
				+ ", action=" + action + ", medication=" + medication + "repeats="+repeats+"]";
	} 

	/**
	 * Method that adds the prescription as a node to a GXL 
	 * document. 
	 * 
	 * Uses the utility functions from GrooveXMLGenerator class 
	 * to add the elements. 
	 * 
	 * See http://www.mkyong.com/java/how-to-create-xml-file-in-java-dom/ 
	 * for a good example of building XML DOM trees using the w3c interface.
	 */
	public Element toGrooveXML(Document doc, Element rootNode, int rxNumber, Element parent){
        Element prescription = (Element)GrooveXMLGenerator.GrooveXMLGeneratorUtils.addNode(doc, rootNode, "prescription"+rxNumber);		
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, prescription, "let:medication=\""+this.medication+"\"");
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, prescription, "let:action=\""+this.action.toString()+"\"");
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, prescription, "let:repeats="+this.repeats);
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addValueToNode(doc, rootNode, prescription, "type:Prescription");
		
		GrooveXMLGenerator.GrooveXMLGeneratorUtils.addEdgeNode(doc, rootNode, prescription.getAttribute("id"), ((Element)this.timing.toGrooveXML(doc, rootNode, rxNumber, prescription)).getAttribute("id"), "timing");
		this.dose.toGrooveXML(doc, rootNode, rxNumber, prescription);  //just need to call this, it will generate the edges for us. 

		//GrooveXMLGenerator.GrooveXMLGeneratorUtils.addEdgeNode(doc, rootNode, prescription.getAttribute("id"), this.dose.toGrooveXML(doc, rootNode, rxNumber, prescription).getAttribute("id"), "dosing");

		return prescription;
	}
	
	/**
	 * Takes the doses and timings and compares them. 
	 * If the number of doses is exactly 1, and the number of timings is more than 1
	 * it will copy the dose for each timing, otherwise it leaves it untouched. 
	 */
	public void adjustTimingAndDose(){
		System.out.println("timing: "+this.timing+" , dose: "+this.dose); 
		if(this.timing.getInstants().size() != this.dose.getDoses().size()){
			if(this.dose.getDoses().size() == 1 && this.timing.getInstants().size() > 1){
				//if there is only 1 dose we can copy it for all the timings.
				for(int i = 1; i < this.timing.getInstants().size(); i++){
					try {
						this.dose.addDose(this.dose.getDoses().get(0));
					} catch (Exception e) {
						e.printStackTrace();
					} 
				}
			}
		}
	}

	/**
	 * Checks the values of this prescription.
	 * Calls sanity checks on the relevant attributes
	 * within this prescription.
	 */
	@Override
	public Boolean sanityCheck() {
		this.timing.sanityCheck(); 
		this.dose.sanityCheck();
		
		//check that we have a matching number of doses for the number of times.
		if(this.timing.getInstants().size() != this.dose.getDoses().size()){
			return false; 
		}
		return true;
	}

	

}
