package annotations;
//Annotations - a supplement to the compiler or the runtime (OR) metadata
class A{
	public void show() {
		System.out.println("Show of A");
	}
}
class B extends A{

	@Override
	public void show() {
		super.show();
	}
	
}
@FunctionalInterface
interface A1{
	void show();
}
public class AnnotationsDemo {

	public static void main(String[] args) {
		

	}

}
