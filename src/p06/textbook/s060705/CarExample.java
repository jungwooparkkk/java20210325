package p06.textbook.s060705;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.compeny : " + car1.compeny);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.compeny : " + car2.compeny);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.compeny : " + car3.compeny);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.compeny : " + car4.compeny);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}
