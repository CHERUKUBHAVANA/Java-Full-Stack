package sealed;
//Sub classes of a sealed class can be final or sealed or non-sealed.
//The same can be applied for interfaces. But, sub-interface can be sealed or non-sealed. But not final (Since, interfaces cannot be final).
sealed class A permits B,C{
	public void show() {
		System.out.println("In A");
	}
}
non-sealed class B extends A{//Allows subclasses like B (of A) to extend any other classes
	public void show() {
		System.out.println("In B");
	}
}
final class C extends A{
	public void show() {
		System.out.println("In C");
	}
}
//class D extends A{
//	
//}gives error
final class D extends B{
	
}
public class SealedClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new C();
		obj.show();
	}

}
