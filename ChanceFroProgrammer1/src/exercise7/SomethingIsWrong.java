package exercise7;


public class SomethingIsWrong {

	public static void main(String[] args) {
		
		// Rectangle myRect; -> If I compile program with declared value 
		// but not initialized, the compiler generates an error. myRect must be 
		// initialized as shown in code below with keyword new and constructor.
		
		Rectangle myRect = new Rectangle(10,30); 
		
		// Instance variables can also be initialize using reference variable myRect
		myRect.width = 40;
		myRect.height = 50;
		
		System.out.println("myRect's area is " + myRect.findArea());

	}

}
