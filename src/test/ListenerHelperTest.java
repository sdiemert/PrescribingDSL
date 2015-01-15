package test;

import static org.junit.Assert.*;
import main.PrescriptionTiming;
import main.PrescriptionTreeListener;
import main.TimeUnit;

import java.lang.NoSuchFieldException; 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListenerHelperTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	/**
	 * Tests removePlural method to see if it does not remove 
	 * characters in words that are non plural
	 */
	public void testRemovePluralWithNonPluralInput() {
		String out = PrescriptionTreeListener.ListenerHelper.removePlural("day"); 
		String out1 = PrescriptionTreeListener.ListenerHelper.removePlural("week"); 
		String out2 = PrescriptionTreeListener.ListenerHelper.removePlural("month"); 
		assertEquals(out, "day"); 
		assertEquals(out1, "week"); 
		assertEquals(out2, "month"); 
	}
	
	@Test
	/**
	 * Tests that removePlural actually correctly removes the extra s. 
	 */
	public void testRemovePluralWithLowerCasePluralInput(){
		String out = PrescriptionTreeListener.ListenerHelper.removePlural("days"); 
		assertEquals(out, "day"); 
	}

	@Test
	/**
	 * Tests that removePlural actually correctly removes the extra s. 
	 */
	public void testRemovePluralWithUpperCasePluralInput(){
		String out = PrescriptionTreeListener.ListenerHelper.removePlural("DAYS"); 
		assertEquals(out, "DAY"); 
	}
	
	@Test
	/**
	 * Test the lookUpIntegerFromString method with normal string inputs (zero, one, two....ten)
	 */
	public void testLookUpIntegerFromStringWithNormalInput(){
		try {
			int zero = PrescriptionTreeListener.ListenerHelper.lookUpIntegerFromString("zero");
			int one = PrescriptionTreeListener.ListenerHelper.lookUpIntegerFromString("one");
			int two = PrescriptionTreeListener.ListenerHelper.lookUpIntegerFromString("two");
			int three = PrescriptionTreeListener.ListenerHelper.lookUpIntegerFromString("three");
			int four = PrescriptionTreeListener.ListenerHelper.lookUpIntegerFromString("four");
			int five = PrescriptionTreeListener.ListenerHelper.lookUpIntegerFromString("five");
			int six = PrescriptionTreeListener.ListenerHelper.lookUpIntegerFromString("six");
			int seven = PrescriptionTreeListener.ListenerHelper.lookUpIntegerFromString("seven");
			int eight = PrescriptionTreeListener.ListenerHelper.lookUpIntegerFromString("eight");
			int nine = PrescriptionTreeListener.ListenerHelper.lookUpIntegerFromString("nine");
			int ten = PrescriptionTreeListener.ListenerHelper.lookUpIntegerFromString("ten");
			
			assertEquals(zero, 0);
			assertEquals(one, 1);
			assertEquals(two, 2);
			assertEquals(three, 3);
			assertEquals(four, 4);
			assertEquals(five, 5);
			assertEquals(six, 6);
			assertEquals(seven, 7);
			assertEquals(eight, 8);
			assertEquals(nine, 9);
			assertEquals(ten, 10);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected=NullPointerException.class)
	/**
	 * Test the lookUpIntegerFromString with invalid input, namely a string that 
	 * does not represent a number.
	 */
	public void testLookUpIntegerWithInvalidInput() throws NullPointerException{
        int x = PrescriptionTreeListener.ListenerHelper.lookUpIntegerFromString("medications");
	}
	
	@Test
	/**
	 * Test that lookUpIntegerFromString will translate a String numberal ("1") to directly to an int
	 */
	public void testLookUpIntegerWithNumeralInput(){
		try{
			int x = PrescriptionTreeListener.ListenerHelper.lookUpIntegerFromString("1"); 
			assert(x == 1); 
		}catch(Exception e){
			fail(); 
		}
	}
	
	@Test(expected=NullPointerException.class)
	/**
	 * Test that lookUpIntegerFromString will handle null as input, should throw an exception.  
	 */
	public void testLookUpIntegerFromStringWithNullInput(){
        int x = PrescriptionTreeListener.ListenerHelper.lookUpIntegerFromString(null); 
	}
	
	@Test(expected=NullPointerException.class)
	/**
	 * Test normalizeTimeUnit with null as input. Should thrown an exception to indicate invalid input. 
	 */
	public void testNormalizeInputWithNullInput() throws NullPointerException, IndexOutOfBoundsException{
		TimeUnit t = PrescriptionTreeListener.ListenerHelper.normalizeTimeUnit(null); 
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	/**
	 * Test normalizeTimeUnit with invalid String as input. Expected that an exception will be thrown. 
	 */
	public void testNormalizeInputWithInvalidInput() throws NullPointerException, IndexOutOfBoundsException{
		TimeUnit t = PrescriptionTreeListener.ListenerHelper.normalizeTimeUnit("pigs"); 
	}
	
	@Test
	/**
	 * Test normalizeTimeUnit with valid String input. ("daily"->TimeUnit.DAY)
	 */
	public void testNormalizeTimeUnitWithValidStringInput(){
		try{
			TimeUnit daily = PrescriptionTreeListener.ListenerHelper.normalizeTimeUnit("daily"); 
			TimeUnit weekly = PrescriptionTreeListener.ListenerHelper.normalizeTimeUnit("weekly"); 
			TimeUnit hourly = PrescriptionTreeListener.ListenerHelper.normalizeTimeUnit("hourly"); 
			TimeUnit monthly = PrescriptionTreeListener.ListenerHelper.normalizeTimeUnit("MONTHLY"); 
			TimeUnit yearly = PrescriptionTreeListener.ListenerHelper.normalizeTimeUnit("YEARLY"); 
			
			assert(daily == TimeUnit.DAY); 
			assert(weekly == TimeUnit.WEEK); 
			assert(monthly == TimeUnit.MONTH); 
			assert(hourly == TimeUnit.HOUR); 
			assert(yearly == TimeUnit.YEAR); 

		}catch(Exception e){
			fail();  //test failed if an exception was thrown. 
		}
	}
	
	@Test
	/**
	 * Test reconcileTimingUnits with timing units that are the same. 
	 */
	public void testReconcileTimingUnitsWithSameUnits(){
		PrescriptionTiming t = new PrescriptionTiming();
		t.setDuration(1);
		t.setDurationUnit(TimeUnit.DAY);
		t.setFreqUnit(TimeUnit.DAY); 
		
		t = PrescriptionTreeListener.ListenerHelper.reconileTimingUnits(t); 
		
		assertEquals(t.getDuration(), 1); 
		assertEquals(t.getUnit(), TimeUnit.DAY); 
		assertEquals(t.getFreqUnit(), TimeUnit.DAY);
		assertEquals(t.getDurationUnit(), TimeUnit.DAY);
	}
	
	@Test
	/**
	 * Test reconcileTimingUnits with units that are not the same. 
	 * This requires that the duration unit be changed to match frequency unit.
	 * The duration amount/value should be adjusted accordingly.
	 */
	public void testReconcileTimingUnitWithDifferentUnits(){
		PrescriptionTiming t = new PrescriptionTiming();
		t.setDuration(1);
		t.setDurationUnit(TimeUnit.WEEK);
		t.setFreqUnit(TimeUnit.DAY); 

		t = PrescriptionTreeListener.ListenerHelper.reconileTimingUnits(t); 

		assertEquals(t.getDuration(), 7); 
		assertEquals(t.getUnit(), TimeUnit.DAY); 
		assertEquals(t.getFreqUnit(), TimeUnit.DAY);
		assertEquals(t.getDurationUnit(), TimeUnit.DAY);
		
	}
}
