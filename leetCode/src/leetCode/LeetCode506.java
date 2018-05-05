package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//506. Relative Ranks
/**
 * 给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold
 * Medal", "Silver Medal", "Bronze Medal"）。
 * 
 * (注：分数越高的选手，排名越靠前。)
 * 
 * @author 89591
 *
 */
public class LeetCode506 {
	
	public static String[] findRelativeRanks(int[] nums) {
		Map<Integer,Integer> record = new HashMap<>();
		String[] res = new String[nums.length];
		for(int i=0;i<nums.length;i++) record.put(nums[i], i);
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++){
			if(i==nums.length-3) res[record.get(nums[i])] = "Bronze Medal";
			else if(i==nums.length-2) res[record.get(nums[i])] = "Silver Medal";
			else if(i==nums.length-1) res[record.get(nums[i])] = "Gold Medal";
			else res[record.get(nums[i])] = nums.length-i+"";
		}
		return res;
	}
	
	public static void main(String[] args) {
		String[] res = findRelativeRanks(new int[]{10,3,8,9,4});
		for (String string : res) {
			System.out.print(string+" ");
		}
	}
}
