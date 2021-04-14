package p07.lecture.p4access_modifier_protected.packgae1;

public class NotChild {
	public void notChildMethod() {
		Parent p = new Parent();
		p.publicMethod(); // ok
		p.protectedMethod(); // ok
		p.defaultMethod(); // ok
//	p.privateMethod(); // not ok
	}
}
