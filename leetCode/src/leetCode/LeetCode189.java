package leetCode;

//189. Rotate Array
/**
 * 将包含 n 个元素的数组向右旋转 k 步。
 * 
 * 例如，如果 n = 7 , k = 3，给定数组 [1,2,3,4,5,6,7] ，向右旋转后的结果为 [5,6,7,1,2,3,4]。
 * 
 * @author 89591
 *
 */
public class LeetCode189 {
	
	public void rotate(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, nums.length-1);
	}
	
	public void reverse(int[] nums, int start, int end){
		int temp = 0;
		while(start<end){
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
