
public class PrimeOrNot {
	public static void main(String[] args) {
		System.out.println(primeOrNot1(12));
		System.out.println(primeOrNot2(17));
	}
	
	public static boolean primeOrNot1(int num) {
		if(num==1)
			return false;
		for(int i=2;i<num;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	public static boolean primeOrNot2(int num) {
		if(num==1)
			return false;
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
}
