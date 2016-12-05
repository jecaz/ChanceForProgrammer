package exercise16;

import java.text.DecimalFormat;

public class FPAdder {

	public static void main(String[] args) {
		
		int numArgs = args.length;
		
		//this program requires at least two arguments on the command line
		if(numArgs < 2){
			System.out.println("This program requires two command-line arguments.");
		}else{
			double sum = 0.0;
			
			for(int i = 0; i < args.length; i++){
				sum += Double.valueOf(args[i]).doubleValue();
				// or we could use parseDouble() method which is more direct than the 
				// valueOf() method -> sum += Double.parseDouble(args[i]);
			}
			
			System.out.println("Sum is: " + sum);
			
			// Format the sum
			DecimalFormat myFormatter = new DecimalFormat("###,###.##");
			String output = myFormatter.format(sum);
			
			// print the sum
			System.out.println("Formated sum: " + output);
		}
	}
}
