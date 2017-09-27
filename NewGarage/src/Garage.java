import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}
	
	public void clearGarage() {
		vehicleList.clear();
	}
	
	public void removeVehicleByRegistration(String registration) {
		for(int i = 0; i < vehicleList.size(); i++) {
			if(vehicleList.get(i).registration == registration) {
				vehicleList.remove(i);
			}
		}
	}
	
	public void garageList() {
		for(int i = 0; i < vehicleList.size(); i++) {
			System.out.println("Reg No: " + vehicleList.get(i).registration + 
					"\nManufacturer: " + vehicleList.get(i).make + "\nYear Made: " + vehicleList.get(i).age);
			System.out.println("------------------------");
		}
	}
}
