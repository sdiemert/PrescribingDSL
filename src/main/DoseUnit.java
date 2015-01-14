package main;

public enum DoseUnit {
	mg("mg"),
	g("g"),
	ng("ng"),
	mcg("mcg"),
	mL("mL"),
	L("L"),
	mcL("mcL"),
	nL("nL");
	
	private String name = null;
	
	private DoseUnit(String s){
		this.name = s;
	}
}
