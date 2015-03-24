package main;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Dose implements PrescriptionElement {
	
	private DoseUnit unit = null; 	
	private int amount = 0; 
	
	public Dose(){
		super(); 
		this.amount = 0;
		this.unit=null; 
	}
	
	public Dose(int amount, DoseUnit unit){
		super(); 
		this.amount = amount; 
		this.unit = unit; 
	}
	
	public void setAmount(int a){
		this.amount = a; 
	}
	
	public void setUnit(DoseUnit u){
		this.unit = u; 
	}
	
	public int getAmount(){
		return this.amount; 
	}
	
	public DoseUnit getUnit(){
		return this.unit; 
	}

	@Override
	public Element toGrooveXML(Document doc, Element rootNode, int rxNumber, Element parent) {
		return null;
	}

	@Override
	public Boolean sanityCheck() {
		// TODO: make me check things. 
		return true;
	}
	
	public String toString(){
		return "{ amount: "+this.amount+", unit: "+this.unit+" }";
	}


}
