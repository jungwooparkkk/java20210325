package p11.textbook.s110603;

public class NewInstancExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("p11.textbook.s110603.SendAction");
//			Class clazz = Class.forName("p11.textbook.s110603.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
