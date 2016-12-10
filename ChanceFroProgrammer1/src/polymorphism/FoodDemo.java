package polymorphism;

public class FoodDemo {

	public static void main(String[] args) {
		
		// polymorphic array
		Food[] food = new Food[3];
		food[0] = new Food();
		food[1] = new Tuna();
		food[2] = new Pineapple();
		Piter p = new Piter();
		
		
		// loop through an array and print out eat() method from superclass and subclasses
		System.out.println("Invoke eat method: ");
		for(int i = 0; i < food.length; i++){
			food[i].eat();
		}
		System.out.println();
		// Invoke digest method
		System.out.println("Piter said that all food was great.");
		for(int i = 0; i < food.length; i++){
			p.digest(food[i]);
		}

	}

}
