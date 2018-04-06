package leetCode;

//169. Majority Element
/**
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 
 * 你可以假设数组是非空的，并且数组中的众数永远存在。
 * 
 * @author 89591
 *
 */
public class LeetCode169 {

	public static int majorityElement(int[] nums) {
		int major = nums[0],count = 1;
		for(int i=1;i<nums.length;i++){
			if(count==0){
				count++;
				major = nums[i];
			}else if(major==nums[i]){
				count++;
			}else {
				count--;
			}
		}
		return major;
	}
	
	public static void main(String[] args) {
		System.out.println(majorityElement(new int[]{1,2,2,2,4,6}));
	}
}
