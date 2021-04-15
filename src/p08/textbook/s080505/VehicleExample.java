package p08.textbook.s080505;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFace();
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
		
	}
}
