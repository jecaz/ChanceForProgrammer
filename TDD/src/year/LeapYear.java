package year;

public class LeapYear {

	public static boolean isLeapYear(final int year) {
	
		/* Refactoring:
		 * 	Instead method return year % 4 == 0 && (!(year % 100 == 0) || year % 400 == 0);
		 * 	I made new method isDivisible to improve readability of code 
		 */
		return isDivisible(year, 4) && 
				(!isDivisible(year, 100) || isDivisible(year, 400));
	}
	
	public static boolean isDivisible(final int year, final int denominator){
		return year % denominator == 0;
	}

}
