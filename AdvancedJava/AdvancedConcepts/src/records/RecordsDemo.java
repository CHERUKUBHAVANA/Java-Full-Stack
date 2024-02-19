package records;

record Account(double balance, int rateOfInterest) {} //variables are private and final by default. No subclass can be created.
public class RecordsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account(12560, 2);
		System.out.println(a);
		System.out.println(a.balance());
	}

}
