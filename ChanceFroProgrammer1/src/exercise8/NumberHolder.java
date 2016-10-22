package exercise8;



public class NumberHolder {
	
	// declare variables
	public int anInt;
	public float aFloat;

	public static void main(String[] args) {
		
		// Create object of NumberHolder class
		NumberHolder numb = new NumberHolder();
		
		// initialize variables
		numb.anInt = 10;
		numb.aFloat = 47.5f;
		
		// print out values
		System.out.print("Integer value\t "  +
					"Float value \n");
		System.out.println("-----------------------------");
		System.out.println(numb.anInt+"\t\t " + numb.aFloat + "\n");

	}

}
