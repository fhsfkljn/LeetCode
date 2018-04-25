package leetCode;

//453. Minimum Moves to Equal Array Elements
/**
 * 给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动可以使 n - 1 个元素增加 1。
 * 
 * @author 89591
 *
 */
public class LeetCode453 {

	public int minMoves(int[] nums) {
		if(nums==null || nums.length==0) return 0;
		int min = nums[0];
		int res = 0;
		for(int n : nums) min = Math.min(min, n);
		for(int n : nums) res += n-min;
		return res;
	}

}
