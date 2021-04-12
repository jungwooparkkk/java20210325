package p07.lecture.p4access_modifier_protected.packgae2;

import p07.lecture.p4access_modifier_protected.packgae1.Parent;

public class Child extends Parent{
	
	public void childMethod() {
		publicMethod(); // ok
		protectedMethod(); // ok
//		defaultMethod(); // not ok
//		privateMethod(); // not ok
	}
}