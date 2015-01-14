package main;

public class PrescriptionTiming {
	
	private int frequency;
	private int length;
	private TimeUnit unit;
	
	public PrescriptionTiming(int freqency, int length, TimeUnit unit){
		this.frequency = frequency;
		this.length = length;
		this.unit = unit; 
	}
	
	public PrescriptionTiming(){
		this.frequency = 0;
		this.length = 0;
		this.unit = null;
	}
	
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public TimeUnit getUnit() {
		return unit;
	}
	public void setUnit(TimeUnit unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "PrescriptionTiming [frequency=" + frequency + ", length="
				+ length + ", unit=" + unit + "]";
	}
	
	

}
