
public class CountDigits {
	public static void main(String[] args) {
		System.out.println("No.of digits : "+countDigits1(125));
		System.out.println("No.of digits : "+countDigits2(12567));
		System.out.println("No.of digits : "+countDigits3(12567));
	}
	public static int countDigits1(int number) {
		int count = 0;
		while(number!=0) {
			number /= 10;
			count++;
		}
		return count;
	}
	public static int countDigits2(int number) {
		String num = Integer.toString(number);
		return num.length();
	}
	public static int countDigits3(int number) {
		return (int)Math.log10(number)+1;
	}
}
