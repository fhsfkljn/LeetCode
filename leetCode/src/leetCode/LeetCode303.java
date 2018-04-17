package leetCode;

//303. Range Sum Query - Immutable
/**
 * 给定一个数组，求出数组从索引 i 到 j (i ≤ j) 范围内元素的总和，包含 i, j 两点。
 * 
 * @author 89591
 *
 */
public class LeetCode303 {
	
	int[] nums;

	public LeetCode303(int[] nums) {
	    for(int i = 1; i < nums.length; i++)
	        nums[i] += nums[i - 1];
	    
	    this.nums = nums;
	}

	public int sumRange(int i, int j) {
	    if(i == 0)
	        return nums[j];
	    
	    return nums[j] - nums[i - 1];
	}
}
