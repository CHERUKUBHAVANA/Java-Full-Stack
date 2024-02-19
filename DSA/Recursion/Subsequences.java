import java.util.*;
public class Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,1,2};
		List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        findSubsets(nums,0,res,subset);
        System.out.println(res);
	}
	public static void findSubsets(int[] nums,int index, List<List<Integer>> res,List<Integer> subset){
        if(index >= nums.length){
            res.add(new ArrayList<Integer>(subset));
            return;
        }
        //exclude - not pick
        findSubsets(nums, index+1, res, subset);
        
        //include - pick
        subset.add(nums[index]);
        findSubsets(nums, index+1, res, subset);
        subset.remove(subset.size()-1);
    }
}
