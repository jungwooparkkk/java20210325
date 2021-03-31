package p04.lecture;

import java.util.Scanner;

public class A13ForGCD {
	public static void main(String[] args) {
		//최대공약수 : greatest common divisor
		// ex : 12, 18 ==> 6
		// ex : 5 , 10 ==> 5
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요>");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		System.out.println("입력 받은 두 수는 " + num1 + "과 " + num2);
		
		//최대공약수를 출력하는 코드 작성...
		
//		int a= 0;
//		while(num1 != 0) {
//			if(num1 < num2) {
//				a = num1;
//				num1 = num2;
//				num2 = a;
//			}
//			num1 = num1 - num2;
			
		for (int d = num1; d>=1; d--) {
			if((num1 % d) == 0 && (num2 % d)== 0) {
				System.out.println("최대공약수는 : "+ d);
				return;
			}
		
			
		}
//		System.out.println("최대공약수 : " + num2);
		scanner.close();
		
		
	}
}
