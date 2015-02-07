package test;

import static org.junit.Assert.*;
import main.PrescriptionTiming;
import main.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrescriptionTimingTest {

	PrescriptionTiming timing = null; 
	
	@Before
	public void setUp() throws Exception {
		timing = new PrescriptionTiming(); 
	}

	@After
	public void tearDown() throws Exception {
		timing = null; 
	}

	@Test
	/**
	 * Check add instant with normal values for hours.
	 */
	public void testAddInstantHours() {
		timing.setFreqUnit(TimeUnit.DAY);
		timing.setFrequency(3);
		timing.addInstant(0); 
		timing.addInstant(12); 
		timing.addInstant(23); 
		assertEquals(this.timing.getInstants().size(), 3); 
		assertTrue(this.timing.getInstants().get(0) == 0); 
		assertTrue(this.timing.getInstants().get(1) == 12); 
		assertTrue(this.timing.getInstants().get(2) == 23); 
	}

	@Test
	/**
	 * Check add instant with normal values for days of the week.
	 */
	public void testAddInstantWithDays() {
		timing.setFreqUnit(TimeUnit.WEEK);
		timing.setFrequency(2);
		timing.addInstant(1); 
		timing.addInstant(5); 
		assertEquals(this.timing.getInstants().size(), 2); 
		assertTrue(this.timing.getInstants().get(0) == 1); 
		assertTrue(this.timing.getInstants().get(1) == 5); 
	}

	@Test
	/**
	 * Check add instant with normal values for days of the month
	 */
	public void testAddInstantWithWeeks() {
		timing.setFreqUnit(TimeUnit.MONTH);
		timing.setFrequency(2);
		timing.addInstant(1); 
		timing.addInstant(20); 
		assertEquals(this.timing.getInstants().size(), 2); 
		assertTrue(this.timing.getInstants().get(0) == 1); 
		assertTrue(this.timing.getInstants().get(1) == 20); 
	}

	@Test(expected=IndexOutOfBoundsException.class)
	/**
	 * Ensure IndexOutOfBoundsException is thrown when 
	 * the frequency set in the timing does not match the 
	 * number of instants that are added.
	 */
	public void testAddInstantWhenFreqDoesNotMatchAdditions() {
		timing.setFreqUnit(TimeUnit.DAY);
		timing.setFrequency(2);
		timing.addInstant(0); 
		timing.addInstant(12); 
		timing.addInstant(23);  //this last one should thrown an exception.
	}

	@Test(expected=IllegalArgumentException.class)
	/**
	 * Ensure that IllegalArguementException is thrown when
	 * and invalid hour is given as input. 
	 */
	public void testAddInstantValuesAboveHourRange() {
		timing.setFreqUnit(TimeUnit.DAY);
		timing.setFrequency(1);
		timing.addInstant(24); 
	}

	@Test(expected=IllegalArgumentException.class)
	/**
	 * Ensure that IllegalArguementException is thrown when
	 * and invalid hour is given as input. 
	 */
	public void testAddInstantValuesBelowHourRange() {
		timing.setFreqUnit(TimeUnit.DAY);
		timing.setFrequency(1);
		timing.addInstant(-1); 
	}

	@Test(expected=IllegalArgumentException.class)
	/**
	 * Ensure that IllegalArguementException is thrown when
	 * and invalid day of the week is given as input. 
	 */
	public void testAddInstantValuesBelowDayRange() {
		timing.setFreqUnit(TimeUnit.WEEK);
		timing.setFrequency(1);
		timing.addInstant(0); 
	}

	@Test(expected=IllegalArgumentException.class)
	/**
	 * Ensure that IllegalArguementException is thrown when
	 * and invalid day of the week is given as input. 
	 */
	public void testAddInstantValuesAboveDayRange() {
		timing.setFreqUnit(TimeUnit.WEEK);
		timing.setFrequency(8);
		timing.addInstant(0); 
	}

	@Test(expected=IllegalArgumentException.class)
	/**
	 * Ensure that IllegalArguementException is thrown when
	 * and invalid day of the month is given as input. 
	 * 
	 */
	public void testAddInstantValuesBelowMonthDayRange() {
		timing.setFreqUnit(TimeUnit.MONTH);
		timing.setFrequency(1);
		timing.addInstant(0); 
	}

	@Test(expected=IllegalArgumentException.class)
	/**
	 * Ensure that IllegalArguementException is thrown when
	 * and invalid day of the month is given as input. 
	 * 
	 * Note, a month is defined as having 28 days. 
	 */
	public void testAddInstantValuesAboveMonthDayRange() {
		timing.setFreqUnit(TimeUnit.MONTH);
		timing.setFrequency(29);
		timing.addInstant(0); 
	}

	@Test(expected=IllegalArgumentException.class)
	/**
	 * Tests that IllegalArgumentException is thrown when the
	 * unit that is input to addInstant is not supported by the 
	 * system.
	 * 
	 * Currently, TimeUnit.YEAR is not supported. 
	 */
	public void testAddInstantWithInvalidTimeUnit() {
		timing.setFreqUnit(TimeUnit.YEAR);
	}

	@Test(expected=ArrayStoreException.class)
	/**
	 * Check that ArrayStoreException is thrown when the 
	 * same value is added more than once. 
	 */
	public void testAddInstantPreviousValue() {
		timing.setFreqUnit(TimeUnit.MONTH);
		timing.addInstant(5);
		timing.addInstant(5); //this one should thrown an exception
	}
}
