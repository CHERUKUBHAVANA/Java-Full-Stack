import java.util.*;
public class SubsequenceSumK {
	public static void main(String[] args) {
		int[] nums = {1,2,1,3,1};
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> subset = new ArrayList<>();
		findSumSubseq(nums,0,res,subset,5,0);
		System.out.print(res);
	}
	
	public static void findSumSubseq(int[] nums,int index,List<List<Integer>> res,List<Integer> subset,int k,int sum) {
		if(index >= nums.length) {
			if(sum == k) {
				res.add(new ArrayList<Integer>(subset));
			}
			return;
		}
		//include
		subset.add(nums[index]);
		sum += nums[index];
		findSumSubseq(nums, index+1,res,subset,k,sum);
		sum -= subset.get(subset.size()-1);
		subset.remove(subset.size()-1);
		
		//exclude
		findSumSubseq(nums,index+1,res,subset,k,sum);
	}

}
