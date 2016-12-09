package exercise1;

/* SportsCar extends superclass Vehicle and inherits all instance variables 
 * from Vehicle and methods which have to override. SportsCar also implements 
 * interface VehicleBehavior and provides an implementation for his methods.
 */

public class SportsCar extends Vehicle implements VehicleBehavior {
	
	private String mark;		// mark of vehicle
	
	// Constructor which use one from superclass Vehicle and one additional parameter mark
	public SportsCar(int p, int f, int m, String mark){
		super(p, f, m);
		this.mark = mark;
	}
	// Override methods getFuelcap() and getMpg() from superclass
	@Override
	public int getFuelcap(){
		return super.getFuelcap();
	}
	@Override
	public int getMpg(){
		return super.getMpg();
	}
	// Get method for specific variable mark of class SportsCar to use its value
	public String getMark() {
		return mark;
	}
	// Get method for specific variable mark of class SportsCar to set its value
	public void setMark(String mark) {
		this.mark = mark;
	}

	/*Error message if I miss one method defined by interface i.e. markIs(String name): 
	 * Type Sportscar must implement the inherited abstract method
	 * VehicleBehavior.markIs(String name).
	 */
	
	@Override
	public int range(){
		return getFuelcap() * getMpg();
	};
	@Override
	public double fuelneeded(int miles){
		return (double) miles / getMpg();
	}
}
