package p15.textbook;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		
	Map<String, String> map = new Hashtable<String, String>();
	
	map.put("Spring", "12");
	map.put("summer", "123");
	map.put("fall", "1234");
	map.put("winter", "12345");
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("아이디와 비밀번호를 입력해주세요.");
	System.out.println("아이디 : ");
	}
}
