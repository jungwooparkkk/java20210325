package p05.enumType;

public class A03EnumTpye {
	public static void main(String[] args) {
		MyEnum e1 = MyEnum.MY_VALUE;
		
		System.out.println(e1 instanceof MyEnum);
		System.out.println(e1 instanceof Object);
		System.out.println(e1 instanceof Enum);
	}
}
