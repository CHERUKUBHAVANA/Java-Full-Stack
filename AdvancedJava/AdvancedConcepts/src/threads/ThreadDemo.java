package threads;

class A extends Thread{
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class B extends Thread{
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class C implements Runnable{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Hi");
		}
	}
}

//class D implements Runnable{
//	public void run() {
//		for(int i=1; i<=10; i++) {
//			System.out.println("Hello");
//		}
//	}
//}


public class ThreadDemo {

	public static void main(String[] args) {
		A obj1 = new A(); // these objects are threads now
		B obj2 = new B();
		
		
		Runnable obj3 = new C();
		Runnable obj4 = () -> {
			for(int i=1; i<=10; i++) {
				System.out.println("Hello");
			}
		};
		System.out.println(obj1.getPriority());
//		obj2.setPriority(Thread.MAX_PRIORITY);
		
//		obj1.start();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		obj2.start();
		
		Thread t1 = new Thread(obj3);
		Thread t2 = new Thread(obj4);
		t1.start();
		t2.start();
	}

}
