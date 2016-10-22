package exercise3;

public class PrePostfixDemo {

	public static void main(String[] args) {
		
		int i = 3;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(++i); // first increment and print incremented value which is 6
		System.out.println(i++); // first print current value (6) and then increment that value 
		System.out.println(i);	// incremented value (7) is printed in this line of code 
 
		/* The code System.out.println(++i) display 6, because the prefix version(++i)
		 * first increment value by 1 and then print incremented value. The next line of
		 * code first print current value and then increment value by 1. The new 
		 * incremented value doesn't get printed until the next line.
		 */
	}

}
