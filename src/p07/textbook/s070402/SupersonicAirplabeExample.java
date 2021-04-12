package p07.textbook.s070402;

public class SupersonicAirplabeExample {
	public static void main(String[] args) {
		SupersonicAirplabe sa = new SupersonicAirplabe();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplabe.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplabe.NORMAL;
		sa.fly();
		sa.land();
	}
}
