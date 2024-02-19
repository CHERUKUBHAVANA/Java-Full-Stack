package interfaces;

interface InterfaceA{
	int age = 21; // static and final by default
	String name = "Bhavana";
	void getDetails(); // public and abstract by default
}
interface InterfaceB{
	int id = 1269;
	void getID();
}

class B2 implements InterfaceC, InterfaceB{

	public void getDetails() {
		System.out.println("Details..." + InterfaceA.name + "'s age is " + InterfaceA.age);
	}
	public void getID() {
		System.out.println(InterfaceB.id);
	}
	public void greetUser() {
		System.out.println("Hello "+InterfaceC.name);
	}
}

interface InterfaceC extends InterfaceA{
	void greetUser();
}

public class InterfaceDemo {

	public static void main(String[] args) {
		InterfaceA obj = new B2();
		obj.getDetails();
		InterfaceB obj1 = new B2();
		obj1.getID();
		InterfaceC obj2 = new B2();
		obj2.greetUser();
	}

}
