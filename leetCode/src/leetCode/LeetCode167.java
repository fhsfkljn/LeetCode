package leetCode;

//167. Two Sum II - Input array is sorted
/**
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 
 * @author 89591
 *
 */
public class LeetCode167 {
	public int[] twoSum(int[] numbers, int target) {
		int l = 0,r = numbers.length-1;
		while(numbers[l]+numbers[r]!=target){
			if(numbers[l]+numbers[r]>target) r--;
			else l++;
		}
		return new int[]{l+1,r+1};
	}
}
