package p07.lecture.p4access_modifier_protected.packgae2;


public class NotChild {
	public void notChildMethod() {
		Parent p = new Parent();
		p.publicMethod(); // ok
//		p.protectedMethod(); // not ok
//		p.defaultMethod(); // not ok
//		p.privateMethod(); // not ok
	}
}