package p10.lecture;

public class A02NullpointerException {
	public static void main(String[] args) {
		System.out.println("프로그램 실행중...");
		
		String str = "java";
		showLEngth(str);
		
		str = null; // null : 참조하는 객체가 없다.
		showLEngth(str);
		
		System.out.println("프로그램 종료...");
	}
	
	private static void showLEngth(String s) {
		System.out.println("길이는" + s.length());
	}
}
