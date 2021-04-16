package p09.lecture;

public class A01NestedClassExample {
	public static void main(String[] args) {
		A01NestedClass.StaticClass o1 = new A01NestedClass.StaticClass(); // 스테틱은 바로 접근가능
//		A01NestedClass.InnerClass o2 = new A01NestedClass.InnerClass();

		A01NestedClass outer1 = new A01NestedClass();
		A01NestedClass.InnerClass o3 = outer1.new InnerClass();
	}
}
