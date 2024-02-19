package interfaces;

@FunctionalInterface
interface A{
	void show(int num);
}
interface B{
	int add(int a, int b);
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
//		A obj = new A() {
//			public void show() {
//				System.out.println("Show updated");
//			}
//		};
		A obj =(num) -> System.out.println("Show updated with num = "+num); //lambda expression
		obj.show(5);
		B obj1 = (a, b) -> a+b;
		System.out.println("Addition result = "+obj1.add(2, 4));
	}
}
