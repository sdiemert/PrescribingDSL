package main;

public class PrescriptionTiming {
	
	private int frequency;
	private int duration; 
	private TimeUnit unit; //this unit is the one we ideally use.
	private TimeUnit freqUnit;
	private TimeUnit durationUnit;
	
	/**
	 * @param frequency
	 * @param duration
	 * @param unit
	 */
	public PrescriptionTiming(int frequency, int length, int duration,
			TimeUnit unit) {
		super();
		this.frequency = frequency;
		this.duration = duration;
		this.unit = unit;
	}

	public PrescriptionTiming(){
		this.frequency = 0;
		this.unit = null;
		this.duration = 0; 
	}
	
	public TimeUnit getFreqUnit() {
		return freqUnit;
	}

	public void setFreqUnit(TimeUnit freqUnit) {
		this.freqUnit = freqUnit;
	}

	public TimeUnit getDurationUnit() {
		return durationUnit;
	}

	public void setDurationUnit(TimeUnit durationUnit) {
		this.durationUnit = durationUnit;
	}

	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
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
		return "PrescriptionTiming [frequency=" + frequency 
				+ ", duration=" + duration + ", unit=" + unit + "]";
	}
}
