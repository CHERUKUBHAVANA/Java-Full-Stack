package enums;

//enum is a class - it can't be extended. By default, it extends Enum class
enum Status{
	Running, Failed, Pending, Success;
}

public class EnumDemo {

	public static void main(String[] args) {
		
		Status s = Status.Success;
		System.out.println(s);
		System.out.println(s.ordinal());
		
		Status[] statusArr = Status.values();
		for(Status s1 : statusArr) {
			System.out.print(s1+" -> "+s1.ordinal()+"\n");
		}
		
		if(s == Status.Running) System.out.println("All Good");
		else if(s == Status.Failed) System.out.println("Try again");
		else if(s == Status.Pending) System.out.println("Please wait");
		else System.out.println("Done!");
		
		switch(s) {
			case Running: 
				System.out.println("All Good");
				break;
			case Failed:
				System.out.println("Try again");
				break;
			case Pending:
				System.out.println("Please wait");
				break;
			default:
				System.out.println("Done!");
				break;
		}
		
		System.out.println(s.getClass().getSuperclass());
	}

}
