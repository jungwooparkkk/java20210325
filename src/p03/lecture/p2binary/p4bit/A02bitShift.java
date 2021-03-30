package p03.lecture.p2binary.p4bit;

public class A02bitShift {
	public static void main(String[] args) {
		// left shift << : 왼쪽으로 비트 이동
		//                 (오른쪽은 0으로 채움)
		//right shift >> : 오른쪽으로 비트 이동
//							(왼쪽비트는 부호비트로 채움)
		//right shift >>>: 오른쪽으로 비트 이동
		//					(왼쪽 비트는 0으로 채움
		
		//left shift <<  : 한칸마다 곱하기 2한 값
		int a = 99; // 0110 0011
		//a <<1     // 1100 0110
		int b = a<<1;
		System.out.println(b);
		
		b = a << 2; // 01 1000 1100
		System.out.println(b);
		
		
		//right shift >> : 한칸마다 나누기 2한 값
		//a         // 0110 0011
		//a >> 1 	// 0011 0001
		System.out.println(a >>1 );
		//a >> 2 	// 0001 1000
		System.out.println(a >>2 );
	}
}
