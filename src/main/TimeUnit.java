package main;

public enum TimeUnit {
	NONE("none"),
	HOUR("hour"),
	DAY("day"),
	WEEK("week"),
	MONTH("month"),
	YEAR("year");
	
	private String name;
	
	private TimeUnit(String s){
		this.name = s; 
	}

}
