package main;

import antlr.prescription.PrescriptionBaseListener;
import antlr.prescription.PrescriptionParser;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

public class PrescriptionTreeListener extends PrescriptionBaseListener{

	private LinkedList<Prescription> scriptList = null; 
	private Prescription currentScript = null;
	private PrescriptionDose currentDose = null;
	private PrescriptionTiming currentTiming = null;
	
	
	/**
	 * Creates an object that listens to callbacks fired by a tree walker. 
	 * Builds a Prescription object which is accessible after the tree walk. 
	 * 
	 * @param parser
	 */
	public PrescriptionTreeListener(){
		this.currentScript =  null;
		this.currentDose = null;
		this.currentTiming = null; 
		this.scriptList = new LinkedList<Prescription>(); 
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
		
		this.currentScript.setMedication(ctx.getText());
	}
	
	@Override
	public void enterAction(PrescriptionParser.ActionContext ctx){
		System.out.println("enterAction() -> "+ ctx.getText());
		PrescriptionAction a = PrescriptionAction.valueOf(ctx.getText().toUpperCase()); 
		System.out.println("Action: "+a); 
		this.currentScript.setAction(a);
	}
	
	@Override
	public void enterDose_unit(PrescriptionParser.Dose_unitContext ctx){
		System.out.println("enterDose_unit() -> "+ ctx.getText());
		this.currentDose.setUnit(DoseUnit.valueOf(ctx.getText().toUpperCase()));
	}

	@Override 
	public void enterDose_amount(PrescriptionParser.Dose_amountContext ctx){
		System.out.println("enterDose_amount() -> "+ Integer.parseInt(ctx.getText()));
		this.currentDose.setAmount(Integer.parseInt(ctx.getText()));
	}
	
	@Override 
	public void exitDose(PrescriptionParser.DoseContext ctx){
		System.out.println("exitDose() -> "+this.currentDose); 
		//perhaps add in handling for if the dose in not actually completed?
		
        this.currentScript.setDose(this.currentDose); 
	}

	@Override
	public void enterFrequency(PrescriptionParser.FrequencyContext ctx){
		System.out.println("enterFrequency() -> "+ ctx.getText());
		
		//need to put code in here to convert between common words 
		//that represent numbers (once == 1, twice == 2) to actual integers.

		try{
			this.currentTiming.setFrequency(Integer.parseInt(ctx.getText()));
		}catch(NumberFormatException e){
			//if we get to this point the frequency was a word like "once" or "three"
			//need to match these against lookup table. 
			try{
                this.currentTiming.setFrequency(ListenerHelper.lookUpIntegerFromString(ctx.getText().toLowerCase())); 
			}catch(Exception ee){
				
			}
		}
	}

	@Override
	public void enterIntervalLength(PrescriptionParser.IntervalLengthContext ctx){
		System.out.println("enterIntervalLength() -> "+ ctx.getText());
		//interval is a TimeUnit like (day, month, hour etc...)
		try {
			this.currentTiming.setFreqUnit(ListenerHelper.normalizeTimeUnit(ctx.getText().toLowerCase()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override 
	public void enterDuration_amount(PrescriptionParser.Duration_amountContext ctx){
		System.out.println("enterDuration_amount() -> "+ ctx.getText());
        try{
			this.currentTiming.setDuration(Integer.parseInt(ctx.getText()));
		}catch(NumberFormatException e){
			//if we get to this point the frequency was a word like "once" or "three"
			//need to match these against lookup table. 
			try{
                this.currentTiming.setDuration(ListenerHelper.lookUpIntegerFromString(ctx.getText().toLowerCase())); 
			}catch(Exception ee){
				
			}
		}
	}

	@Override 
	public void enterDuration_unit(PrescriptionParser.Duration_unitContext ctx){
		System.out.println("enterDuration_unit() -> "+ ctx.getText());
		
		this.currentTiming.setDurationUnit(TimeUnit.valueOf(ListenerHelper.removePlural(ctx.getText().toUpperCase()))); 
	}
	
	@Override
	public void exitTiming(PrescriptionParser.TimingContext ctx){
		System.out.println("exitTiming() ->"+ctx.getText()); 

		//TODO: Added reconciling of duration and interval units. 
		
		//at this point we assume that the entire timing object has been built. 
		//commit the timing object to the prescription.

		this.currentScript.setTiming(this.currentTiming);
		
	}
	
	@Override 
	public void enterAtom(PrescriptionParser.AtomContext ctx){
		System.out.println("enterAtom() ->"+ctx.getText()); 
		
		//when we enter a new atomic prescription context create the 
		//supporting objects required to make them work.
		this.currentScript = new Prescription(); 
        this.currentDose = new PrescriptionDose(); 
		this.currentTiming = new PrescriptionTiming(); 
	}
	
	@Override
	public void exitAtom(PrescriptionParser.AtomContext ctx){
		System.out.println("exitAtom() ->"+ctx.getText()); 
		
		//now that we are exiting the node we can store the Prescription 
		//object in the list of prescriptions for reference later.
		
		this.currentTiming = ListenerHelper.reconileTimingUnits(this.currentTiming); 
		this.scriptList.add(this.currentScript); 
		this.currentDose = null; 
		this.currentTiming = null;
		this.currentScript = null; 
	}
	
	/**
	 * Helper class for the PrescriptionTreeListener.
	 * 
	 * Contains methods for converting between different unit types 
	 * and operations for managing conversions.
	 * 
	 * @author sdiemert
	 *
	 */
	public static class ListenerHelper{

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
		

		
		/*			HOUR   DAY	  WEEK  MONTH   YEAR
		 * HOUR	    1 
		 * DAY		24	   1      
		 * WEEK		168	   7	   1
		 * MONTH	672	   30	   4	  1
		 * YEAR		8064   365	   52	  12    1	
		 */
		
		//This solution with mapping between time units is not ideal and does not account for major calendar things like 30 months etc....
		//it shoudl be fine for any prescription that is under a year in length. 
		private final static Map<TimeUnit, Map<TimeUnit, Integer>> timeUnitConversionMap = new HashMap<TimeUnit, Map<TimeUnit, Integer>>(); 
		private static Map<TimeUnit, Integer> hourMap = new HashMap<TimeUnit, Integer>(); 
		private static Map<TimeUnit, Integer> dayMap = new HashMap<TimeUnit, Integer>(); 
		private static Map<TimeUnit, Integer> weekMap = new HashMap<TimeUnit, Integer>(); 
		static{
			//hours -> ? 
			hourMap.put(TimeUnit.HOUR, 1); 
			hourMap.put(TimeUnit.DAY, 24);
			hourMap.put(TimeUnit.WEEK, 168);
			hourMap.put(TimeUnit.MONTH, 672); //month is 28 days here....fix this to be better later.
			hourMap.put(TimeUnit.YEAR, 8736);
			timeUnitConversionMap.put(TimeUnit.HOUR, hourMap); 

			//days -> ?
			dayMap.put(TimeUnit.DAY, 1);
			dayMap.put(TimeUnit.WEEK, 7);
			dayMap.put(TimeUnit.MONTH, 28); //month is 28 days here....fix this to be better later.
			dayMap.put(TimeUnit.YEAR, 365);
			timeUnitConversionMap.put(TimeUnit.DAY, dayMap); 
	
			//weeks -> ?
			weekMap.put(TimeUnit.WEEK, 1);
			weekMap.put(TimeUnit.MONTH, 4); //month is 28 days here....fix this to be better later.
			weekMap.put(TimeUnit.YEAR, 52);
			timeUnitConversionMap.put(TimeUnit.WEEK, weekMap); 

			//Maybe add more, but not sure it is worth it....this is a temp fix.
		}

		public static int lookUpIntegerFromString(String s) throws NullPointerException{
			int x = 0; 

			if(s == null){
				throw new NullPointerException("null is not a valid string"); 
			}

			//attempt to parse the string to an int directly ("1" -> 1)
			try{
				x = Integer.parseInt(s); 
			}catch(NumberFormatException e){
				//if parsing the int directly fails, do a look up. 
                x = numberMap.get(s);  //if this fails it will throw an exception
			}
			return x; 
		}

		public static TimeUnit normalizeTimeUnit(String s) throws NullPointerException, IndexOutOfBoundsException{
			TimeUnit x = null; 
			if(s == null){
				throw new NullPointerException("null is not a valid string"); 
			}
			x = timeUnitMap.get(s.toLowerCase()); 
			if(x == null){
				throw new IndexOutOfBoundsException(s+" is an invalid TimeUnit string."); 
			}
			return x; 
		}
		
		public static PrescriptionTiming reconileTimingUnits(PrescriptionTiming t){
			
			int x = 0; 
			//need to make sure that the duration and interval units agree. 
			//t.freqUnit and t.durationUnit need to be reconciled, the number of 
			//units of the duration or freq will have to be adjusted. 

			if(t.getFreqUnit() == t.getDurationUnit()){
				//if they are the same we agree already, return.
				t.setUnit(t.getFreqUnit());
				System.out.println(t.getUnit()); 
			}else{
				//based on the interval unit we need to figure out hte duration in 
				//the same units.
			
				//there are x freqUnits in one durationUnit
				x = timeUnitConversionMap.get(t.getFreqUnit()).get(t.getDurationUnit());
				t.setDuration(x*t.getDuration());
				t.setDurationUnit(t.getFreqUnit()); 
				t.setUnit(t.getFreqUnit()); 
			}
			return t; 
		}
		
		public final static String removePlural(String s){
			if(s.endsWith("S")||s.endsWith("s")){
				return s.substring(0, s.length()-1); 
			}else{
				return s; 
			}
		}
	}
}
