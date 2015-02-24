package main;

import antlr.prescription.PrescriptionBaseListener;
import antlr.prescription.PrescriptionParser;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

public class PrescriptionTreeListener extends PrescriptionBaseListener{

	private LinkedList<Prescription> scriptList = null; 
	private Prescription currentScript 			= null;
	private PrescriptionDose currentDose 		= null;
	private PrescriptionTiming currentTiming 	= null;
	
	/* TEMP VARIBLES: */ 
	private Dose tempDose = null; 
	
	//temp vars for handling titrating dose input
	private Dose tempStartDose 			= null;
	private Dose tempStopDose 			= null; 
	private Dose tempChangeDose 		= null; 
	private int tempTitratingDirection 	= 1; //1 is increasing, -1 is down. This variable is used as a multiplier on the tempChangeDose
	private int tempDurationAmount 		= 0;
	private TimeUnit tempDurationUnit 	= null; 
	
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
		this.currentScript.setMedication(ctx.getText());
	}
	
	@Override
	public void enterAction(PrescriptionParser.ActionContext ctx){
		System.out.println("enterAction() -> "+ ctx.getText());
		PrescriptionAction a = PrescriptionAction.valueOf(ctx.getText().toUpperCase()); 
		System.out.println("Action: "+a); 
		this.currentScript.setAction(a);
	}
	
	/******************DOSING****************************/
	
	@Override 
	public void enterDose(PrescriptionParser.DoseContext ctx){
		System.out.println("enterDose() -> "+ctx.getText()); 
	}

	@Override 
	public void exitDose(PrescriptionParser.DoseContext ctx){
		System.out.println("exitDose() -> "+ctx.getText()); 
		this.currentScript.setDose(this.currentDose);
	}

	@Override
	public void enterFixedDose(PrescriptionParser.FixedDoseContext ctx){
		System.out.println("enterFixedDose() -> "+ctx.getText());
		this.currentDose = new FixedPrescriptionDose(); 
	}

	@Override
	public void enterTitratingDose(PrescriptionParser.TitratingDoseContext ctx){
		System.out.println("enterTitratingDose() -> "+ctx.getText());
		this.currentDose = new TitratingPrescriptionDose(); 
	}

	@Override
	public void exitTitratingDose(PrescriptionParser.TitratingDoseContext ctx){
		System.out.println("exitTitratingDose() -> "+ctx.getText());
		((TitratingPrescriptionDose)this.currentDose).setIntervalLength(this.tempDurationAmount);
		((TitratingPrescriptionDose)this.currentDose).setIntervalTimeUnit(this.tempDurationUnit);
		((TitratingPrescriptionDose)this.currentDose).setStartDose(this.tempStartDose);
		((TitratingPrescriptionDose)this.currentDose).setStopDose(this.tempStopDose);
		((TitratingPrescriptionDose)this.currentDose).setAmountChange(this.tempChangeDose);
		this.currentDose.addDose(this.tempStartDose); 
	}
	
	@Override
	public void enterTitratingDirection(PrescriptionParser.TitratingDirectionContext ctx){
		System.out.println("enterTitratingDirection() -> "+ctx.getText());
		if(ctx.getText().toUpperCase().equals("UP")){
			this.tempTitratingDirection = 1; 
		}else if(ctx.getText().toUpperCase().equals("DOWN")){
			this.tempTitratingDirection = -1; 
		}else{
			System.out.println("Cound not determine titrating direction based on input: "+ctx.getText()); 
			//TODO: fail gracefully
		}
	}
	
	@Override
	public void exitTitratingStart(PrescriptionParser.TitratingStartContext ctx){
		System.out.println("exitTitratingStart() -> "+ctx.getText());
		this.tempStartDose = this.tempDose; 
	}

	@Override
	public void exitTitratingStop(PrescriptionParser.TitratingStopContext ctx){
		System.out.println("exitTitratingStop() -> "+ctx.getText());
		this.tempStopDose = this.tempDose; 
	}
	
	@Override
	public void exitTitratingChange(PrescriptionParser.TitratingChangeContext ctx){
		System.out.println("exitTitratingChange() -> "+ctx.getText());
		System.out.println(this.tempDose); 
		this.tempChangeDose = this.tempDose; 
		this.tempChangeDose.setAmount(this.tempChangeDose.getAmount()*this.tempTitratingDirection);
	}

	@Override
	public void enterDoseAtom(PrescriptionParser.DoseAtomContext ctx){
		System.out.println("enterDoseAtom() -> "+ ctx.getText());
		this.tempDose = new Dose(); 
	}

	@Override
	public void exitDoseAtom(PrescriptionParser.DoseAtomContext ctx){
		System.out.println("exitDoseAtom() -> "+ ctx.getText());
		if(this.tempDose.sanityCheck()){
			if(this.currentDose.getClass() == FixedPrescriptionDose.class){
				this.currentDose.addDose(this.tempDose); 
			}else if(this.currentDose.getClass() == TitratingPrescriptionDose.class){
				//do nothing, we handle this later.
			}
		}else{
			//TODO: Fail gracefully. 
			System.out.println("ERROR: Could not parse doseAtom in exitDoseAtom with ctx: "+ctx.getText()); 
		}
		System.out.println("currentDose: "+currentDose); 
	}	
	
	@Override
	public void enterDoseUnit(PrescriptionParser.DoseUnitContext ctx){
		System.out.println("enterDoseUnit() -> "+ ctx.getText());

		if(this.tempDose != null){
			try{
				this.tempDose.setUnit(DoseUnit.valueOf(ctx.getText().toUpperCase()));
			}catch(Exception e){
				//TODO: Fail gracefully
				e.printStackTrace();
			}
		}else{
			//TODO: Fail gracefully
			System.out.println("ERROR: could not parse doseUnit in enterDoseUnit with ctx: "+ctx.getText()); 
		}
	}

	@Override 
	public void enterDoseAmount(PrescriptionParser.DoseAmountContext ctx) {
		System.out.println("enterDoseAmount() -> "+ Integer.parseInt(ctx.getText()));
		
		if(this.tempDose != null){
			try{
				this.tempDose.setAmount(Integer.parseInt(ctx.getText()));
			}catch (Exception e){
				//TODO: Fail gracefully
				e.printStackTrace();
			}
		}else{
			//TODO: Fail gracefully
			System.out.println("ERROR: could not parse doseAmount in enterDoseAmout with ctx: "+ctx.getText()); 
		}
	}
	
	@Override
	public void enterSpecificDose(PrescriptionParser.SpecificDoseContext ctx){
		System.out.println("enterSpecificDose() -> "+ ctx.getText());
	}

	/******************DOSING END****************************/

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
			e.printStackTrace();
		}
	}

	@Override 
	public void enterDurationAmount(PrescriptionParser.DurationAmountContext ctx){
		System.out.println("enterDurationAmount() -> "+ ctx.getText());
        try{
        	this.tempDurationAmount = Integer.parseInt(ctx.getText()); 
		}catch(NumberFormatException e){
			//if we get to this point the frequency was a word like "once" or "three"
			//need to match these against lookup table. 
			try{
				this.tempDurationAmount = ListenerHelper.lookUpIntegerFromString(ctx.getText().toLowerCase()); 
			}catch(Exception ee){
				//TODO: Handle this error!
				ee.printStackTrace(); 
			}
		}
	}
	
	@Override
	public void exitDuration(PrescriptionParser.DurationContext ctx){
		System.out.println("exitDuration() -> "+ ctx.getText());
		this.currentTiming.setDurationUnit(this.tempDurationUnit); 
		this.currentTiming.setDuration(this.tempDurationAmount); 
	}

	@Override 
	public void enterDurationUnit(PrescriptionParser.DurationUnitContext ctx){
		System.out.println("enterDurationUnit() -> "+ ctx.getText());
		this.tempDurationUnit = TimeUnit.valueOf(ListenerHelper.removePlural(ctx.getText().toUpperCase())); 
	}
	
	@Override
	public void exitTiming(PrescriptionParser.TimingContext ctx){
		System.out.println("exitTiming() ->"+ctx.getText()); 

		//If hours have not yet been specified we need to assign them
		//based on the interval. 
		if(this.currentTiming.getInstants().size() <= 0){
			if(this.currentTiming.getFreqUnit() == TimeUnit.DAY){
				//need to define min and max in terms of hours
				ListenerHelper.generateInstants(this.currentTiming, 8, 22);
			}else if(this.currentTiming.getFreqUnit() == TimeUnit.MONTH){
				//define min and max in terms of day of month
				ListenerHelper.generateInstants(this.currentTiming, 1, 28);
			}else if(this.currentTiming.getFreqUnit() == TimeUnit.WEEK){
				//define in terms of days of week (represented by numbers 1 through 7)
				ListenerHelper.generateInstants(this.currentTiming, 1, 7);
			}
		}
		//at this point we assume that the entire timing object has been built. 
		//commit the timing object to the prescription.
		this.currentScript.setTiming(this.currentTiming);
	}
	
	@Override
	public void exitInstant(PrescriptionParser.InstantContext ctx){
		System.out.println("exitHour() ->"+ctx.getText());
		try{
			this.currentTiming.addInstant(Integer.parseInt(ctx.getText()));
		}catch(Exception e){
			System.out.println("Could not parse: "+ctx.getText()+" as interger"); 
			e.printStackTrace();
		}
	}
	
	@Override 
	public void enterAtom(PrescriptionParser.AtomContext ctx){
		System.out.println("enterAtom() ->"+ctx.getText()); 
		
		//when we enter a new atomic prescription context create the 
		//supporting objects required to make them work.
		this.currentScript = new Prescription(); 
        this.currentDose = null;  //cannot create this yet as we don't know what kind of dosing we are dealing with. 
		this.currentTiming = new PrescriptionTiming(); 
	}
	
	@Override
	public void exitAtom(PrescriptionParser.AtomContext ctx){
		System.out.println("exitAtom() ->"+ctx.getText()); 
		
		//now that we are exiting the node we can store the Prescription 
		//object in the list of prescriptions for reference later.
		
		this.currentTiming = ListenerHelper.reconileTimingUnits(this.currentTiming); 
		this.currentScript.adjustTimingAndDose();
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

		/**
		 * Generates instants for the @param currentTiming object based on the 
		 * frequency and interval of the timing. It is an error if instants have 
		 * already been assigned. 
		 * 
		 * @param currentTiming - the timing object to operate on.
		 * @param rangeMin - the minimum number in the range (also the first instant) e.g. 8:00 
		 * @param rangeMax - the maximum number to distribute the instants across e.g. 22:00 
		 * @throws IllegalArgumentException if the timing object already has instants assigned. 
		 */
		public static void generateInstants(PrescriptionTiming currentTiming, int rangeMin, int rangeMax) throws IllegalArgumentException{

			int quotient = 0; 
			if(currentTiming.getInstants().size() > 0){
				throw new IllegalArgumentException("timing: "+currentTiming.toString()+" already has instant values assigned to it."); 
			}
			
			if(rangeMax <= rangeMin){
				throw new IllegalArgumentException("minimum must be less than maximum"); 
			}

			//This logic needs to be reviewed by domain expert...
			
			quotient = (rangeMax - rangeMin)/currentTiming.getFrequency(); 
			
			for(int i = 0; i < currentTiming.getFrequency(); i++){
				currentTiming.addInstant(rangeMin+i*quotient);
			}
		}

		public static TimeUnit normalizeTimeUnit(String s) throws NullPointerException, IndexOutOfBoundsException{
			TimeUnit x = null; 
			if(s == null){
				throw new NullPointerException("null is not a valid string"); 
			}
			try{
				x = TimeUnit.valueOf(s.toUpperCase()); 
			}catch(IllegalArgumentException iae){
				x = timeUnitMap.get(s.toLowerCase()); 
                if(x == null){
                	throw new IndexOutOfBoundsException(s+" is an invalid TimeUnit string."); 
                }
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
