package main;

public class PrescriptionTiming {
	
	private int frequency;
	private int length;
	private int duration; 
	private TimeUnit unit;
	
	/**
	 * @param frequency
	 * @param length
	 * @param duration
	 * @param unit
	 */
	public PrescriptionTiming(int frequency, int length, int duration,
			TimeUnit unit) {
		super();
		this.frequency = frequency;
		this.length = length;
		this.duration = duration;
		this.unit = unit;
	}

	public PrescriptionTiming(){
		this.frequency = 0;
		this.length = 0;
		this.unit = null;
		this.duration = 0; 
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

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "PrescriptionTiming [frequency=" + frequency + ", length="
				+ length + ", duration=" + duration + ", unit=" + unit + "]";
	}


	
	
	

}
