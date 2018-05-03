package leetCode;

//485. Max Consecutive Ones
/**
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 * 
 * @author 89591
 *
 */
public class LeetCode485 {
	
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0,temp = 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==1) temp++;
			else{
				max = Math.max(max, temp);
				temp = 0;
			}
		}
		return Math.max(max, temp);
	}
}
