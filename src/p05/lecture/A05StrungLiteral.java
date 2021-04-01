package p05.lecture;

public class A05StrungLiteral {
	public static void main(String[] args) {
		//그림 : 04참조타입
		
		String s = new String("java");
		String t = "java";
		String u = "java";
		
		System.out.println(s == t);
		System.out.println(t == u);
	}
}
