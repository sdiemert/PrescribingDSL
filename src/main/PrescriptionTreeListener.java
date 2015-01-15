package main;

import antlr.prescription.PrescriptionBaseListener;
import antlr.prescription.PrescriptionParser;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

public class PrescriptionTreeListener extends PrescriptionBaseListener{

	private Translator translator = null; 
	private PrescriptionParser parser = null;
	private LinkedList<Prescription> scriptList = null; 
	private Prescription current_script = null;
	private PrescriptionDose current_dose = null;
	private PrescriptionTiming current_timing = null;
	
	
	/**
	 * Creates an object that listens to callbacks fired by a tree walker. 
	 * Builds a Prescription object which is accessible after the tree walk. 
	 * 
	 * @param parser
	 */
	public PrescriptionTreeListener(PrescriptionParser parser){
		this.parser = parser; 
		this.current_script =  null; 
		this.current_dose = null;
		this.current_timing = null; 
		this.scriptList = new LinkedList<Prescription>(); 
		this.translator = new Translator();
	}
	
	/**
	 * Returns the Prescription object that was generated from the tree walk.
	 * There is no guarantee that it will be a complete prescription object.
	 */
	public LinkedList<Prescription> getPrescription(){
		return this.scriptList;
	}
	
	@Override
	public void enterMedication(PrescriptionParser.MedicationContext ctx){
		System.out.println("enterMedication() -> "+ctx.getText());
		
		//do checking here for medicationt types etc....
		
		this.current_script.setMedication(ctx.getText());
	}
	
	@Override
	public void enterAction(PrescriptionParser.ActionContext ctx){
		System.out.println("enterAction() -> "+ ctx.getText());
		PrescriptionAction a = PrescriptionAction.valueOf(ctx.getText().toUpperCase()); 
		System.out.println("Action: "+a); 
		this.current_script.setAction(a);
	}
	
	@Override
	public void enterDose_unit(PrescriptionParser.Dose_unitContext ctx){
		System.out.println("enterDose_unit() -> "+ ctx.getText());
		this.current_dose.setUnit(DoseUnit.valueOf(ctx.getText()));
	}

	@Override 
	public void enterDose_amount(PrescriptionParser.Dose_amountContext ctx){
		System.out.println("enterDose_amount() -> "+ Integer.parseInt(ctx.getText()));
		this.current_dose.setAmount(Integer.parseInt(ctx.getText()));
	}
	
	@Override 
	public void exitDose(PrescriptionParser.DoseContext ctx){
		System.out.println("exitDose() -> "+this.current_dose); 
		//perhaps add in handling for if the dose in not actually completed?
		
        this.current_script.setDose(this.current_dose); 
	}

	@Override
	public void enterFrequency(PrescriptionParser.FrequencyContext ctx){
		System.out.println("enterFrequency() -> "+ ctx.getText());
		
		//need to put code in here to convert between common words 
		//that represent numbers (once == 1, twice == 2) to actual integers.

		try{
			this.current_timing.setFrequency(Integer.parseInt(ctx.getText()));
		}catch(NumberFormatException e){
			//if we get to this point the frequency was a word like "once" or "three"
			//need to match these against lookup table. 
			try{
                this.current_timing.setFrequency(Translator.lookUpIntegerFromString(ctx.getText().toLowerCase())); 
			}catch(Exception ee){
				
			}
		}
	}

	@Override
	public void enterInterval_length(PrescriptionParser.Interval_lengthContext ctx){
		System.out.println("enterInterval_length() -> "+ ctx.getText());
		//interval is a TimeUnit like (day, month, hour etc...)
		try {
			this.current_timing.setUnit(Translator.normalizeTimeUnit(ctx.getText().toLowerCase()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override 
	public void enterDuration_amount(PrescriptionParser.Duration_amountContext ctx){
		System.out.println("enterDuration_amount() -> "+ ctx.getText());
        try{
			this.current_timing.setDuration(Integer.parseInt(ctx.getText()));
		}catch(NumberFormatException e){
			//if we get to this point the frequency was a word like "once" or "three"
			//need to match these against lookup table. 
			try{
                this.current_timing.setDuration(Translator.lookUpIntegerFromString(ctx.getText().toLowerCase())); 
			}catch(Exception ee){
				
			}
		}
	}

	@Override 
	public void enterDuration_unit(PrescriptionParser.Duration_unitContext ctx){
		System.out.println("enterDuration_unit() -> "+ ctx.getText());
		//TODO: Need to update this method to reconcil between the tow time units. 
	}
	
	@Override
	public void exitTiming(PrescriptionParser.TimingContext ctx){
		System.out.println("exitTiming() ->"+ctx.getText()); 

		//TODO: Added reconciling of duration and interval units. 
		
		//at this point we assume that the entire timing object has been built. 
		//commit the timing object to the prescription.

		this.current_script.setTiming(this.current_timing);
		
	}
	
	@Override 
	public void enterAtom(PrescriptionParser.AtomContext ctx){
		System.out.println("enterAtom() ->"+ctx.getText()); 
		
		//when we enter a new atomic prescription context create the 
		//supporting objects required to make them work.
		this.current_script = new Prescription(); 
        this.current_dose = new PrescriptionDose(); 
		this.current_timing = new PrescriptionTiming(); 
	}
	
	@Override
	public void exitAtom(PrescriptionParser.AtomContext ctx){
		System.out.println("exitAtom() ->"+ctx.getText()); 
		
		//now that we are exiting the node we can store the Prescription 
		//object in the list of prescriptions for reference later.
		
		this.scriptList.add(this.current_script); 
		this.current_dose = null; 
		this.current_timing = null;
		this.current_script = null; 
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
		
		private final static Map<String, TimeUnit> timeUnitMap = new HashMap<String, TimeUnit>(); 
		static{
			timeUnitMap.put("daily", TimeUnit.DAY); 
			timeUnitMap.put("hourly", TimeUnit.HOUR); 
			timeUnitMap.put("weekly", TimeUnit.WEEK); 
			timeUnitMap.put("monthly", TimeUnit.MONTH); 
			timeUnitMap.put("yearly", TimeUnit.YEAR); 
		}

		public static int lookUpIntegerFromString(String s) throws Exception{
			if(s == null){
				throw new Exception("null is not a valid string"); 
			}
			//TODO: possibly add more error handling here.
			return numberMap.get(s); 
		}

		public static TimeUnit normalizeTimeUnit(String s) throws Exception{
			if(s == null){
				throw new Exception("null is not a valid string"); 
			}
			//TODO: possibly add more error handling here.
			return timeUnitMap.get(s); 
		}
	}
}
