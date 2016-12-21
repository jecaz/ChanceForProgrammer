package exercise1;

/* SportsCar extends superclass Vehicle and inherits all instance variables 
 * from Vehicle and methods which have to override. 
 */

public class SportsCar extends Vehicle {
	
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
	
	@Override
	public int range(){
		return getFuelcap() * getMpg();
	};
	@Override
	public double fuelneeded(int miles){
		return (double) miles / getMpg();
	}
}
