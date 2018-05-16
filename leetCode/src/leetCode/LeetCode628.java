package leetCode;

import java.util.Arrays;

//628. Maximum Product of Three Numbers
/**
 * ����һ���������飬���������ҳ�����������ɵ����˻������������˻���
 * 
 * @author 89591
 *
 */
public class LeetCode628 {
	
	public static int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		return Math.max(nums[0]*nums[1], nums[nums.length-2]*nums[nums.length-3])*nums[nums.length-1];
	}
	
	public static void main(String[] args) {
		System.out.println(maximumProduct(new int[]{-4,-3,-2,-1,6}));
	}
}
