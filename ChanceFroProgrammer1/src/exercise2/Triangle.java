package exercise2;

/* Goal of this exercise is to define some fields, illegal field names. 
 * Try leaving fields and local variable uninitialized and print out their values. 
 */

public class Triangle {
	
	private double width;
	private double height;
	static int numOfTriangle;
	/* double 8height, !height, height:; 
	 * This variable names are not comply with naming rules and conventions.
	 * Error message is: Syntax error on token "8", "!" and ":", delete this token.
 	 */
	
	// Use constructor to count number of created triangle objects
	public Triangle(){
		numOfTriangle++;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getHeight(){
		return height;
	}
	
	// Method which show dimension(width and height) for triangle objects
	public void showDimension(){
		System.out.println("Width and height are " + getWidth() + " and " + getHeight());
	}
	
	// Use two parameters to set instance variables, invoke showDimension method,
	// compute and print out area of triangle
	public void findArea(double w, double h){
		width = w;
		height = h;
		showDimension();
		double area = width * height / 2;
		/*double y;  -> System.out.println(y);
		 * If declare variable y, but not initialize it error message will be: 
		 * The local variable y may not have been initialized. */
		System.out.println("Area of triangle is " + area);
		
	}
}
