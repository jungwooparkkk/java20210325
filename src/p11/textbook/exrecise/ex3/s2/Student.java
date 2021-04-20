package p11.textbook.exrecise.ex3.s2;


public class Student {
	private int studentNum;
	
	public Student(int studentNum) {
		this.studentNum = studentNum;
	}
	
	public int getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student compareKey = (Student) obj;
			if(this.studentNum == compareKey.studentNum) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}



}
