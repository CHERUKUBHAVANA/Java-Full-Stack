
public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Reverse of a number is : "+reverse1(1234));
		System.out.println("Reverse of a number is : "+reverse2(1234));
	}
	public static int reverse1(int number) {
		int rem = 0;
		int reverse = 0;
		while(number!=0) {
			rem = number % 10;
			number /= 10;
			reverse = reverse*10+rem;
		}
		return reverse;
	}
	
	public static int reverse2(int number) {
		StringBuilder num = new StringBuilder(Integer.toString(number));
		return Integer.parseInt(num.reverse().toString());
	}
}
