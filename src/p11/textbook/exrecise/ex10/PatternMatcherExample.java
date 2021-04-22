package p11.textbook.exrecise.ex10;

import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		String id = "5Angel1004";
		
		//알파벳시작, 숫자알파벳, 총8~12
		String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("아이디로 사용할 수 있습니다.");
		} else {
			System.out.println("아이디로 사용할 수 없습니다.");
		}
	}
}
