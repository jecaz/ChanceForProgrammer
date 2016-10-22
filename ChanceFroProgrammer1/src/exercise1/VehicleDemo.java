package exercise1;

public class VehicleDemo {

	public static void main(String[] args) {
		
		// Instantiate Vehicle and SportsCar classes and initialize their instance variables
		Vehicle minivan = new Vehicle(7,16, 21);
		SportsCar sportscar = new SportsCar (2, 14, 12, "BMW");
		
		double gallons;
		int distance = 252;
		
		// Introduction with minivan
		
		System.out.println("Minivan can carry " + minivan.getPassengers() + 
				" passengers with range of " + minivan.range() + " miles.");
		gallons = minivan.fuelneeded(distance);
		System.out.println("To go " + distance + " miles minivan needs " + gallons + 
				         " gallons of fuel." );
		
		System.out.println();
		
		// Introduction with sportscar
		
		System.out.println(sportscar.getMark() + " can carry " + sportscar.getPassengers() + 
				" passengers with range of " + sportscar.range() + " miles.");
		gallons = sportscar.fuelneeded(distance);
		System.out.println("To go " + distance + " miles BMW needs " + gallons + 
				         " gallons of fuel." );

	}

}
