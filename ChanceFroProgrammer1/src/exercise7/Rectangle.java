package exercise7;

public class Rectangle {
	
	// two instance variables 
	int width;
	int height;
	 
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
		System.out.println("myRect's area initialy in constructor is " 
							+ findArea());
		System.out.println("--------------------------------------------");
	}
	
	// Compute area of rectangle
	public int findArea(){
		return width * height;
	}

}
