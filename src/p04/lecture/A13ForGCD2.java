package p04.lecture;

import java.util.Scanner;

public class A13ForGCD2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요>");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		System.out.println("입력 받은 두 수는 " + num1 + "과 " + num2);
		int a;
		for ( a = num1; a>=1; a--) {
			if((num1%a) == 0 &&(num2%a) == 0) {
				System.out.println(a);
				break;
			}
		}
		
	}
}
