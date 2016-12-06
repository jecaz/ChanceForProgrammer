package test_leapyear;

import static org.junit.Assert.*;

import org.junit.Test;

import year.LeapYear;

public class LeapYearTest {
	
	/* a year is a leap year if it is divisible by four
	 * but, years divisible by 100, are not leap years,
	 * except years divisible by 400.
	 */

	@Test
	public void leapYearsAreDivisibleByFour(){
		assertTrue(LeapYear.isLeapYear(2016));
	}
	
	@Test
	public void normalYearsAreNotDivisibleByFour(){
		assertFalse(LeapYear.isLeapYear(2013));
	}
	
	@Test
	public void leapYearsAreNotDivisibleByOneHundred(){
		// assertTrue(LeapYear.isLeapYear(2016));
		assertFalse(LeapYear.isLeapYear(1900));
	}
	
	@Test
	public void leapYearsAreDivisibleByFourHundred(){
		assertTrue(LeapYear.isLeapYear(2000));
	}
}
