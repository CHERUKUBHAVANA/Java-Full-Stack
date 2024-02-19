import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.*;
public class Basics{
	public static void main(String[] args){
		ArrayList<Integer> heights = new ArrayList<>();
		heights.add(30);
		heights.add(10);
		heights.add(60);
		heights.add(10);
		heights.add(60);
		heights.add(50);
		int prev = 0;
		int prev2 = 0;
		for(int i=1; i<heights.size(); i++){
			int fs =  prev + Math.abs(heights.get(i-1) - heights.get(i));
			int ss = Integer.MAX_VALUE;
			if(i > 1)
				ss = prev2 + Math.abs(heights.get(i-2) - heights.get(i));
			int curi = Math.min(fs,ss);
			prev2 = prev;
			prev = curi;
		}
		System.out.println(prev);
	}
	private static int minEnergy(int index,ArrayList<Integer> heights,int[] dp){
		if(index == 0)
			return 0;
		if(dp[index] != -1){
			return dp[index];
		}
		int	left = minEnergy(index-1,heights,dp) + Math.abs(heights.get(index) - heights.get(index-1));
		int right = Integer.MAX_VALUE;
		if(index > 1)
			right = minEnergy(index-2,heights,dp) + Math.abs(heights.get(index) - heights.get(index-2));
		return dp[index] = Math.min(left,right);
	}
}