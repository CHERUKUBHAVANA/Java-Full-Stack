import java.util.ArrayList;

public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 22, 12, 3, 0, 6};
		ArrayList<Integer> ans = findLeaders1(arr);
		for(int i : ans)
			System.out.print(i+" ");
		
		System.out.println();
		
		ArrayList<Integer> ans1 = findLeaders2(arr);
		for(int i : ans1)
			System.out.print(i+" ");
	}

	private static ArrayList<Integer> findLeaders2(int[] arr) {
		// TODO Auto-generated method stub
		int max = arr[arr.length-1];
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(max);
		for(int i = arr.length-2; i>=0; i--) {
			if(arr[i]>max) {
				ans.add(arr[i]);
			}
			max = Math.max(max, arr[i]);
		}
		return ans;
	}

	private static ArrayList<Integer> findLeaders1(int[] arr) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			boolean leader = true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					leader = false;
					break;
				}
			}
			if(leader)
				ans.add(arr[i]);
		}
		return ans;
	}
	
	

}
