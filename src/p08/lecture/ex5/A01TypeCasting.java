package p08.lecture.ex5;

public class A01TypeCasting {
	public static void main(String[] args) {
		Malamute d1 = new Malamute();
		d1.bark();
		d1.sit();
		d1.pull();
		
		Pet p1 = d1;
//		p1.bark() //X
		p1.sit(); //O
//		p1.pull(); //X
		
		SledDog s1 = d1;
//		s1.bark(); //X
//		s1.sit(); //X
		s1.pull(); //O
	
		KindaDog k1 = d1;
		k1.bark(); //O
//		k1.sit();//X
//		k1.pull(); //X
		
		Malamute d2 = (Malamute) k1;
		d2.bark();
		d2.sit();
		d2.pull();
		
		Wolf w1 = (Wolf)k1;
		w1.bark();
		
		System.out.println("프로그램 종료");
	}
}
