package p07.textbook.s070804;

public abstract class Animal {
	public String Kind;
	
	public void breathe() {
		System.out.println("숨을쉽니다.");
	}
	public abstract void sound();
}
