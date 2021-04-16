package p09.textbook.exercise.ex4;

public class NestdClassEample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car.tire tire = myCar.new tire();

		Car.Engine engine = new Car.Engine();
	}
}
