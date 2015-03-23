/**
 * Abstract class for a dose object. This class must be 
 * extended by a concrete implementation of a dose to be used. 
 * 
 * Keeps track of a list of doses (order of these doses matters!) 
 */
package main;

import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public abstract class PrescriptionDose{
	private Dose tempDose = null; 
	
	//this list keeps track of the doses
	//the order of this list matters as it is 
	//linked to the order of timing instants in the 
	//corresponding PrescriptionTiming class. 
	protected ArrayList<Dose> doses = null; 
	
	/**
	 * Creates a newly initalized version of the presription dose.  
	 * Adds a single dose to the list of doses. 
	 * 
	 * @param amount : the number of units to give. Example 81 in "81 mg"
	 * @param unit : the unit of measure for the dose. 
	 */
	public PrescriptionDose(int amount, DoseUnit unit) {
		super();
		this.doses = new ArrayList<Dose>(); 
		this.doses.add(new Dose(amount, unit)); 
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
	
	/**
	 * Add a new dose to the list of doses.
	 * @param d
	 */
	public void addDose(Dose d){
		this.doses.add(d); 
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

	/**
	 * This method must be implemented by the appropriate sub-class.
	 * 
	 * @param doc
	 * @param rootNode
	 * @param rxNumber
	 * @return
	 */
	public Element toGrooveXML(Document doc, Element rootNode, int rxNumber) {
		return null;
	}

	/**
	 * Checks the properties of the PrescriptionDose 
	 * to see if they are consistent with the data model.
	 *
	 * This should  be implemented by the appropriate sub-classes. 
	 * @return
	 */
	public Boolean sanityCheck() {
		return null;
	}
}
