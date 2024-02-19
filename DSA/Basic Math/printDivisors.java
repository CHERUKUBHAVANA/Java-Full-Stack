
public class printDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDivisors1(18);
		printDivisors2(18);
	}
	
	public static void printDivisors1(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				System.out.println(i);
		}
	}
	
	public static void printDivisors2(int num) {
		for(int i=1;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				System.out.println(i);
				if(i != num/i)
					System.out.println(num/i);
			}
		}
	}

}
