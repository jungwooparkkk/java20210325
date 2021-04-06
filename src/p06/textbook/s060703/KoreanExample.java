package p06.textbook.s060703;

public class KoreanExample {
	public static void main(String[] args) {
		Korean K1 = new Korean("박자바", "011225-1234567");
		System.out.println("k1.name : "+ K1.name);
		System.out.println("k1.ssn : "+ K1.ssn);
		
		Korean K2 = new Korean("김자바", "930525-0654321");
		System.out.println("K2.name: "+ K2.name);
		System.out.println("K2.ssn : "+ K2.ssn);
	}
}
