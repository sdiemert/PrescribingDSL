package main;

public enum PrescriptionAction {
	TAKE("take"); 
	
	private String name; 
	
	private PrescriptionAction(String s){
		name = s; 
	}
	
	public String toString(){
		return name;
	}
}
