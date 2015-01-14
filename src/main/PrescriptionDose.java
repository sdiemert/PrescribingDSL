package main;

public class PrescriptionDose {
	private int amount;
	private DoseUnit unit;
	
	/**
	 * @param amount : the number of units to give. Example 81 in "81 mg"
	 * @param unit : the unit of measure for the dose. 
	 */
	public PrescriptionDose(int amount, DoseUnit unit) {
		super();
		this.amount = amount;
		this.unit = unit;
	}
	
	public PrescriptionDose(){
		super(); 
		this.amount = 0; 
		this.unit = null;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public DoseUnit getUnit() {
		return unit;
	}
	public void setUnit(DoseUnit unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "PrescriptionDose [amount=" + amount + ", unit=" + unit + "]";
	} 
	
	
	
}
