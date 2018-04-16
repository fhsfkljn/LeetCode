package leetCode;

//268. Missing Number
/**
 * 给出一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * 
 * @author 89591
 *
 */
public class LeetCode268 {
	
	public int missingNumber(int[] nums) {
		int sum = (nums.length+1)*nums.length/2;
		for(int n : nums) sum -= n;
		return sum;
	}
}
