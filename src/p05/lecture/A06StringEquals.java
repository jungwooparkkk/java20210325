package p05.lecture;

public class A06StringEquals {
	public static void main(String[] args) {
		// 05 참조타입 그림
		
		String s = new String("java");
		String t = "java";
		String u = "java";
		
		boolean d1 = s.equals(t);
		System.out.println(s == t); //false
		System.out.println(d1); // true
		
		System.out.println(s.equals(s)); //true
		System.out.println(t.equals(u)); //true
	}
}
