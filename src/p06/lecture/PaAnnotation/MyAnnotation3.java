package p06.lecture.PaAnnotation;

public @interface MyAnnotation3 {
	int value() default 5;
	int attr1() default 10;
	int attr2() default 99;
}
