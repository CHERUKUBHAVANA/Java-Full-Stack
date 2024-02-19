
public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPalindrome1(12321));
		System.out.println(checkPalindrome2(12323));
	}
	
	public static boolean checkPalindrome1(int number) {
		int reverse = 0;
		int num = number;
		int rem = 0;
		while(number!=0) {
			rem = number % 10;
			number /= 10;
			reverse = reverse*10+rem;
		}
		return reverse == num;
	}
	
	public static boolean checkPalindrome2(int number) {
		StringBuilder reverse = new StringBuilder(Integer.toString(number));
		reverse.reverse();
		return Integer.parseInt(reverse.toString())==number;
	}

}
