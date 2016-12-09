package exercise2;



public class TriangleDemo {

	public static void main(String[] args) {
		// Create two objects
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		// Use static variable and some methods from Object class(parent class from every class)
		System.out.println("There is " + Triangle.numOfTriangle + " objects of type "
				+ t1.getClass().getSimpleName());
		
		System.out.println();
		
		// Use of showDimension method
		System.out.println("This showDimension method will display default values"
				+ " of t2 triangle:");
		t2.showDimension(); 
		
		System.out.println("\nInformation about t1 triangle:");
		
		// Use of findArea method
		t1.findArea(6,10);
		
		// Checking if t1 object is instance of Triangle class
		System.out.println("t1 is instance of Triangle and Object class: " + (t1 instanceof Triangle) 
							+ " and " + (t1 instanceof Object));

	}

}
