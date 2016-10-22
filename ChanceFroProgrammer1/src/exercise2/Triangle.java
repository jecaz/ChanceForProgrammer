package exercise2;

/* Goal of this exercise is to defines some fields, illegal field names,
 * tries leaving the fields uninitialized and prints out their values. The same is
 * done for local variable.
 */

public class Triangle {
	
	private double width;
	private double height;
	static int numOfTriangle;
	/* double 8height, !height, height:; 
	 * This variable names are not comply with naming rules and convections.
	 * Error message is: Syntax error on token "8", "!" and ":", delete this token.
 	 */
	
	// Use constructor to count number of triangle objects
	public Triangle(){
		numOfTriangle++;
	}
	// Method which show dimension(width and height) for triangle objects
	public void showDimension(){
		System.out.println("Width and height are " + width + " and " + height);
	}
	// Use two parameters to set instance variables, invoke showDimension method 
	// compute and print out area of triangle
	public void findArea(double w, double h){
		width = w;
		height = h;
		showDimension();
		double area = width * height / 2;
		/*double y; System.out.println(y);
		 * If declare variable y, but not initialize it error message will be: 
		 * The local variable y may not have been initialized. */
		System.out.println("Area of triangle is " + area);
		
	}
}
