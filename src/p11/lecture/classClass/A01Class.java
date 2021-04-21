package p11.lecture.classClass;

import java.lang.reflect.Field;

public class A01Class {
	public static void main(String[] args) throws Exception {
		MyClass o1 = new MyClass();

		Class c1 = Class.forName("P11.lecture.class.Class.MyClass");

		System.out.println(c1.getName());
		Field[] fields = c1.getDeclaredFields();
		System.out.println(fields[0].getName());
		System.out.println(fields[1].getName());
		
		System.out.println(fields.length);
		
		Constructor[] constructor = c1.getDeclaredConstructors();
		
	}
}

class MyClass {
	private int field1;
	private int field2;

	MyClass() {

	}

	MyClass(int param1) {

	}

	public void method1() {

	}

	public void method2() {

	}

}