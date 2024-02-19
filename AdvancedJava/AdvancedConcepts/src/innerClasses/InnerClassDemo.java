package innerClasses;

class A{
	int num;
	public void show() {
		System.out.println("in A show");
	}
	class B{
		public void config() {
			System.out.println("in B config");
		}
	}
	static class C{
		public void config() {
			System.out.println("in C config");
		}
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		A obj = new A();
		obj.show();
		A.B obj1 = obj.new B();
		obj1.config();
		A.C obj2 = new A.C();
		obj2.config();
	}

}
