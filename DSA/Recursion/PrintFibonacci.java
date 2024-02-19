
public class PrintFibonacci {
	public static void main(String[] args) {
		printFibo1(8);
		System.out.println(printFibo2(8));
	}

	private static int printFibo2(int n) {
		// TODO Auto-generated method stub
		if(n<=1)
			return 1;
		int a = printFibo2(n-1);
		int b = printFibo2(n-2);
		return a+b;
	}

	private static void printFibo1(int n) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int i = 3;
		int c = 0;
		System.out.print(a+" "+b+" ");
		while(i<=8) {
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
			i++;
		}
	}
}
