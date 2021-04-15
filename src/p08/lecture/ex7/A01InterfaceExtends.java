package p08.lecture.ex7;

public class A01InterfaceExtends {
	public static void main(String[] args) {
		MyInterface2 i2 = new MyInterface1() {
			
		};
	}
}

interface Myinterface1 {
	void method1();
}
	
interface Myinterface2 extends Myinterface1 {
	void method2();
}