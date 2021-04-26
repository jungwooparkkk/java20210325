package p13.textbook.exercises.ex3;

import java.util.Set;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();

		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
	}
}

class Container<T, S> {
	private T Key;
	private S Value;

	public T getKey() {
		return Key;
	}

	public void set(T key, S value) {
		this.Key = key;
		this.Value = value;
	}

	public S getValue() {
		return Value;
	}
}