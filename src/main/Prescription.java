package main;

public class Prescription {
	
	private PrescriptionTiming timing; 
	private PrescriptionDose dose;
	private PrescriptionAction action; 
	private String medication;
	
	public Prescription(PrescriptionTiming timing, PrescriptionDose dose, PrescriptionAction action, String medication){
		this.timing = timing;
		this.dose = dose;
		this.action = action;
		this.medication = medication; 
	}
	
	public Prescription(){
		this.timing = null; 
		this.dose = null;
		this.action = null;
		this.medication = null;
	}
	
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

	@Override
	public String toString() {
		return "Prescription [timing=" + timing + ", dose=" + dose
				+ ", action=" + action + ", medication=" + medication + "]";
	} 
	
	

}
