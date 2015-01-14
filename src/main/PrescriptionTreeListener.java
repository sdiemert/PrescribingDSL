package main;

import antlr.prescription.PrescriptionBaseListener;
import antlr.prescription.PrescriptionParser;

import java.util.HashMap;
import java.util.Map;

public class PrescriptionTreeListener extends PrescriptionBaseListener{

	private Prescription script = null;
	private PrescriptionParser parser = null;
	private PrescriptionDose dose = null;
	private PrescriptionTiming timing = null;
	
	private Translator translator = null; 
	
	/**
	 * Creates an object that listens to callbacks fired by a tree walker. 
	 * Builds a Prescription object which is accessible after the tree walk. 
	 * 
	 * @param parser
	 */
	public PrescriptionTreeListener(PrescriptionParser parser){
		this.parser = parser; 
		this.script = null;
		this.dose = new PrescriptionDose(); 
		this.timing = new PrescriptionTiming(); 
		this.translator = new Translator();
	}
	
	/**
	 * Returns the Prescription object that was generated from the tree walk.
	 * There is no guarantee that it will be a complete prescription object.
	 */
	public Prescription getPrescription(){
		return script;
	}
	
	@Override
	public void enterMedication(PrescriptionParser.MedicationContext ctx){
		System.out.println("enterMedication() -> "+ctx.getText());
		
		//do checking here for medicationt types etc....
		
		this.script.setMedication(ctx.getText());
	}
	
	@Override
	public void enterAction(PrescriptionParser.ActionContext ctx){
		System.out.println("enterAction() -> "+ ctx.getText());
		this.script.setAction(PrescriptionAction.valueOf(ctx.getText().toUpperCase()));
	}
	
	@Override
	public void enterDose_unit(PrescriptionParser.Dose_unitContext ctx){
		System.out.println("enterDose_unit() -> "+ ctx.getText());
		this.dose.setUnit(DoseUnit.valueOf(ctx.getText()));
	}

	@Override 
	public void enterDose_amount(PrescriptionParser.Dose_amountContext ctx){
		System.out.println("enterDose_amount() -> "+ Integer.parseInt(ctx.getText()));
		this.dose.setAmount(Integer.parseInt(ctx.getText()));
	}
	
	@Override 
	public void exitDose(PrescriptionParser.DoseContext ctx){
		System.out.println("exitDose() -> "+this.dose); 
		//perhaps add in handling for if the dose in not actually completed?
		
        this.script.setDose(this.dose); 
	}

	@Override
	public void enterFrequency(PrescriptionParser.FrequencyContext ctx){
		System.out.println("enterFrequency() -> "+ ctx.getText());
		
		//need to put code in here to convert between common words 
		//that represent numbers (once == 1, twice == 2) to actual integers.

		try{
			this.timing.setFrequency(Integer.parseInt(ctx.getText()));
		}catch(NumberFormatException e){
			//if we get to this point the frequency was a word like "once" or "three"
			//need to match these against lookup table. 
			try{
                this.timing.setFrequency(Translator.lookUpIntegerFromString(ctx.getText().toLowerCase())); 
			}catch(Exception ee){
				
			}
		}
	}

	@Override
	public void enterInterval_length(PrescriptionParser.Interval_lengthContext ctx){
		System.out.println("enterInterval_length() -> "+ ctx.getText());
		//interval is a TimeUnit like (day, month, hour etc...)
		this.timing.setUnit(TimeUnit.valueOf(ctx.getText().toLowerCase()));
	}

	@Override 
	public void enterDuration_amount(PrescriptionParser.Duration_amountContext ctx){
		System.out.println("enterDuration_amount() -> "+ ctx.getText());
        try{
			this.timing.setDuration(Integer.parseInt(ctx.getText()));
		}catch(NumberFormatException e){
			//if we get to this point the frequency was a word like "once" or "three"
			//need to match these against lookup table. 
			try{
                this.timing.setDuration(Translator.lookUpIntegerFromString(ctx.getText().toLowerCase())); 
			}catch(Exception ee){
				
			}
		}
	}

	@Override 
	public void enterDuration_unit(PrescriptionParser.Duration_unitContext ctx){
		System.out.println("enterDuration_unit() -> "+ ctx.getText());
		//TODO: Need to update this method to reconcil between the tow time units. 
	}
	
	public static class Translator{

		private final static Map<String, Integer> numberMap = new HashMap<String, Integer>(); 
		static{
			numberMap.put("zero", 0);
			numberMap.put("once", 1);
			numberMap.put("twice", 2);
			numberMap.put("thrice", 3);
			numberMap.put("one", 1); 
			numberMap.put("two", 2); 
			numberMap.put("three", 3); 
			numberMap.put("four", 4); 
			numberMap.put("five", 5); 
			numberMap.put("six", 6); 
			numberMap.put("seven", 7); 
			numberMap.put("eight", 8); 
			numberMap.put("nine", 9); 
			numberMap.put("ten", 10); 
		}
		
		public static int lookUpIntegerFromString(String s) throws Exception{
			if(s == null){
				throw new Exception("null is not a valid string"); 
			}
			return numberMap.get(s); 
		}
	}
}
