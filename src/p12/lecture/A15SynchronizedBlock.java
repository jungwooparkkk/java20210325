package p12.lecture;

public class A15SynchronizedBlock {
	public static void main(String[] args) {
		
	}
}

class Thread15 extends Thread {
	public Memory memory;
	@Override
	public void run() {
		memory.execute();
	}
}

class Memory {
	public void execute() {
		System.out.println("statment1");
		
		synchronized (this) {
			System.out.println("statment2");
			System.out.println("statment3");			
		}
		
		System.out.println("statment4");
	}
}