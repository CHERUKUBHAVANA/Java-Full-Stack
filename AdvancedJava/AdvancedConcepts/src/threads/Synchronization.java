package threads;

class Increment{
	int count;
	public synchronized void increment() {
		count++;
	}
}
public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		Increment inc = new Increment();
		Runnable obj1 = () -> {
			for(int i=1; i<=1000; i++)
			inc.increment();
		};
		Runnable obj2 = () -> {
			for(int i=1; i<=1000; i++)
			inc.increment();
		};
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		t1.join(); // start the main thread only after t1's execution
		t2.join();
		System.out.println(inc.count);
	}

}
