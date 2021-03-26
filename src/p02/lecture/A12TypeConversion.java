package p02.lecture;

public class A12TypeConversion {
	public static void main(String[] args) {
		// 실수
		float floarVal1 = 3.14F;
		double doubleVar1;
		
		//자동 형변횐
		doubleVar1 = floarVal1;
				
		//강제 형변환 (casting)
//		floatVar1 =(float) doubleVar1
				
		///////////////////////////////////
				
		//정수 -> 실수
		int intVar1 = 3;
		float floatVar2 = intVar1; //자동형변환
		double doubleVar2 = intVar1; // 자동형변환
		
		//실수 ->정수
		double doubleVar3 = 3.14;
		int intvar3 = (int) doubleVar3; //강제 형변환(casting)
		System.out.println();
	}
}
