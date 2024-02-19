
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isArmstrong(153));
	}
	
	public static boolean isArmstrong(int num) {
		int m = num;
		int sum = 0;
		int rem = 0;
		while(num!=0) {
			rem = num%10;
			num /= 10;
			sum += (rem*rem*rem);
		}
		return m==sum;
	}

}
