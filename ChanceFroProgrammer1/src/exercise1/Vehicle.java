package exercise1;

//Create new classes for each real-world object

public class Vehicle implements VehicleBehavior{
	
	private int passengers;		// number of passengers
	private int fuelcap;		// fuel capacity in gallons
	private int mpg;			// fuel consumption in miles per gallon
	
	// Create constructor with three parameters to initial instance variables 
	// when the object is created
	Vehicle (int p, int f, int m){
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	// Create methods getters and setters for instance variables
	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getFuelcap() {
		return fuelcap;
	}

	public void setFuelcap(int fuelcap) {
		this.fuelcap = fuelcap;
	}

	public int getMpg() {
		return mpg;
	}

	public void setMpg(int mpg) {
		this.mpg = mpg;
	}

	// This method supplies implementation of method from interface VehicleBehavior
	// and computes range of the vehicle
	@Override
	public int range(){
		return fuelcap * mpg;
	}
	
	/*Error message if I miss one method defined by interface i.e. fuelneeded(int miles): 
	 * Type Vehicle must implement the inherited abstract method
	 * VehicleBehavior.fuelneeded(int miles).
	 */
	
	// This method supplies implementation of method from interface VehicleBehavior
	// and computes how much fuel is needed depending on miles
	@Override
	public double fuelneeded(int miles){
		return (double) miles / mpg;
	}

}
