package innerClasses;

class A1{
	public void show() {
		System.out.println("In A show");
	}
}
abstract class B1{
	abstract public void show();
}
public class AnonymousInnerClassDemo {
	
	public static void main(String[] args) {
		
		A1 obj = new A1() {
			public void show() {
				System.out.println("In A show updated");;
			}
		};
		obj.show();
		
		B1 obj1 = new B1() {
			public void show() {
				System.out.println("In abstract B show updated");
			}
		};
		obj1.show();

	}

}
