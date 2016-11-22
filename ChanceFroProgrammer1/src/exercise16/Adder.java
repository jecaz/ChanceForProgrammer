package exercise16;

public class Adder {

public static void main(String[] args) {
		
		int numArgs = args.length;

		//this program requires at least two arguments on the command line
	        if (numArgs < 2) {
	            System.out.println("This program requires two command-line arguments.");
	        } else {
		    int sum = 0;
		    
		    for (int i = 1; i < numArgs; i++) {
		    		// return string arguments from command line first in Integer wrapper class,
		    		// than convert it in primitive int value
	                sum += Integer.valueOf(args[i]).intValue();
		    }
		    
		    int firstElementArg = Integer.valueOf(args[0]).intValue();
		    //print the sum and first element args[0]
	            System.out.println("The first element of the array is " 
	            		+ firstElementArg + 
	            		" and the sum of all elements, except first one," 
	            		+ "in the array is " + sum);

	        }
	}
}
