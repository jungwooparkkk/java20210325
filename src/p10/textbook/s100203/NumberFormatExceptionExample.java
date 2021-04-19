package p10.textbook.s100203;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "100a";
		
		int value1 = Integer.parseUnsignedInt(data1);
		int value2 = Integer.parseUnsignedInt(data1);
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" result);
	}
}
