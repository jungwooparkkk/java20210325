package p05.lecture;

public class A04ReferenceType {
	public static void main(String[] args) {
		//그림 : 03참조타입
		
		int i = 3;
		int j = i;
		
		String s = new String("java");
		String t = s;
		
		
		System.out.println( i ==j);
		System.out.println(s == t);
	}
}
