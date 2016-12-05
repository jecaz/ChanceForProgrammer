package exercise16;

public class FPAdderMain {

	public static void main(String[] args) {
		
		String[] numbers = {"15000.8", "25000.2", "10000.1"};
		
		System.out.println("I have a question for you. Could you explain me why\n" 
				+ "DecimalFormat pattern \"###,###.##\" does not work here?\n" 
				+ "It should prints out 50,001.10, but the result is 50.001,1.\n");
		
		FPAdder.main(numbers);

	}

}
