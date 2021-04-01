package p04.textbook;

public class Text2 {
	public static void main(String[] args) {
		int a = (int) (Math.random() * 6) + 1;
		int b = (int) (Math.random() * 6) + 1;
		int c = a + b;

		while (a <= 6) {
			a++;
			if (c == 5) {
				System.out.println(a + ", " + b);
				
			}
		}
	}
}
