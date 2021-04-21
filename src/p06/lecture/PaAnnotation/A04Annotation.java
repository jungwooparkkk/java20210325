package p06.lecture.PaAnnotation;

public class A04Annotation {
	@MyAnnotation3(999) //값을 하나만 줄 때 value 면 생략 가능
	public void method1() {
		
	}
	@MyAnnotation3(value = 999)
	public void method2() {
		
	}
	
	@MyAnnotation3(value = 999, attr1 = 765)
	public void method3() {
		
	}
}
