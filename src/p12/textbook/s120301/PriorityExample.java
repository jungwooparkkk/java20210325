package p12.textbook.s120301;

public class PriorityExample {
	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			Thread thread = new calcThread();
		}
	}
}
