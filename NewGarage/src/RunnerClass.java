
public class RunnerClass {

	public static void main(String[] args) {
		Garage garage = new Garage();
		
		Car car1 = new Car("WB14 3DC", "Nissan", 2013, 4, 1.8);
		Car car2 = new Car("DF11 5AV", "Mercedes", 2009, 4, 3.5);
		
		garage.addVehicle(car1);
		garage.addVehicle(car2);
		
		garage.garageList();
		
		garage.removeVehicleByRegistration("WB14 3DC");
		
		garage.garageList();
	}
}
