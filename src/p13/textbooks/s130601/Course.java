package p13.textbooks.s130601;

public class Course<T> {
	private String name;
	private T[] studends;
	
	public Course(String name, int capacity) {
		this.name = name;
		studends = (T[])(new Object[capacity]);
	}
	public String getName() {
		return name;
	}
	public T[] getStudents() {
		return studends;
	}
	public void add(T t) {
		for(int i = 0; i < studends.length; i++) {
			if(studends[i] == null) {
				studends[i] = t;
				break;
			}
		}
	}
}
