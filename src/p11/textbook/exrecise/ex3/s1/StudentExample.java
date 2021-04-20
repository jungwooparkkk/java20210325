package p11.textbook.exrecise.ex3.s1;

import java.util.HashMap;

import p11.textbook.exrecise.ex3.Student;

public class StudentExample {
	public static void main(String[] args) {
		// Student 키로 총점을 저장하는 HashMap 객체 생성
		HashMap<Student, String> hashMap = new HashMap<Student, String>();

		// new Student("1")의 점수 95를 저장
		hashMap.put(new Student("1"), "95");

		// new Student("1")로 점수를 읽어옴
		String score = hashMap.get(new Student("1"));
		System.out.println("1반 학생의 총점 : " + score);
	}
}
