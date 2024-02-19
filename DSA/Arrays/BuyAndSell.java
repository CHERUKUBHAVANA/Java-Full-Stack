
public class BuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,6,5,3,5,13};
		System.out.println(maximumProfit1(arr));
		System.out.println(maximumProfit2(arr));
	}

	private static int maximumProfit2(int[] arr) {
		// TODO Auto-generated method stub
		int maxProfit = 0;
		int min = arr[0];
		int cost = 0;
		for(int i=1;i<arr.length;i++) {
			cost = arr[i] - min;
			maxProfit = Math.max(maxProfit, cost);
			min = Math.min(min,arr[i]);
		}
		return maxProfit;
	}

	private static int maximumProfit1(int[] arr) {
		// TODO Auto-generated method stub
		int maxProfit = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i] && arr[j]-arr[i]>maxProfit) {
					maxProfit = arr[j] - arr[i];
				}
			}
		}
		return maxProfit;
	}

}
