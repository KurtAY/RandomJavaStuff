
public class Bus extends Vehicle {

	boolean isDoubleDecker;
	
	public Bus(String registration, String make, int age, boolean isDoubleDecker) {
		super(registration, make, age);
		this.isDoubleDecker = isDoubleDecker;
	}
}
