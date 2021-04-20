package p11.textbook.exrecise.ex3;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
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
		return studentNum.hashCode();
	}
}
