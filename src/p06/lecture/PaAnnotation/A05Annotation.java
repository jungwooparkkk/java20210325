package p06.lecture.PaAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@ForType
public class A05Annotation {
	@ForType
	@ForFieldAndMethode
	int field;
	
	@ForFieldAndMethode
	public void method1() {
		
	}
	
}

@Target(ElementType.TYPE)
@interface ForType {}

@Target(ElementType.FIELD)
@interface ForFiled {}

@Target({ElementType.FIELD, ElementType.METHOD})
@interface ForFieldAndMethode {}