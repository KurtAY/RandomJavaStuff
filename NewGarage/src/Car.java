
public class Car extends Vehicle {
	
	int numberOfDoors;
	double engineSize;
	
	public Car(String registration, String make, int age, int numberOfDoors, double engineSize) {
		super(registration, make, age);
		this.numberOfDoors = numberOfDoors;
		this.engineSize = engineSize;
	}
}
