package main;

import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public abstract class PrescriptionDose{
	private Dose tempDose = null; 
	protected ArrayList<Dose> doses = null; 
	
	/**
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

	public Element toGrooveXML(Document doc, Element rootNode, int rxNumber) {
		return null;
	}

	public Boolean sanityCheck() {
		return null;
	}
}
