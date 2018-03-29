package leetCode;

//53. Maximum Subarray
public class LeetCode53 {
	public static int maxSubArray(int[] nums) {
		int max = nums[0], temp = nums[0];
		for (int i = 1; i < nums.length; i++) {
			temp = Math.max(temp + nums[i], nums[i]);
			max = Math.max(max, temp);
		}
		return max;
	}
}
