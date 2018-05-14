package leetCode;

import java.util.Arrays;

//581. Shortest Unsorted Continuous Subarray
/**
 * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * 
 * 你找到的子数组应是最短的，请输出它的长度。
 * 
 * @author 89591
 *
 */
public class LeetCode581 {
	
	public int findUnsortedSubarray(int[] nums) {
		if(nums==null || nums.length==0) return 0;
		int[] pre = nums.clone();
		Arrays.sort(nums);
		
		int head = -1,tail = -1;
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=pre[i]){
				if(head==-1) head = i;
				tail = i;
			}
		}
		return head==-1 ? 0 : tail-head+1;
	}
}
