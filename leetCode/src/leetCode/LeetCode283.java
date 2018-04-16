package leetCode;

//283. Move Zeroes
/**
 * 给定一个数组 nums, 编写一个函数将所有 0 移动到它的末尾，同时保持非零元素的相对顺序。
 * 
 * 例如， 定义 nums = [0, 1, 0, 3, 12]，调用函数之后， nums 应为 [1, 3, 12, 0, 0]。
 * 
 * @author 89591
 *
 */
public class LeetCode283 {
	
	public static void moveZeroes(int[] nums) {
		int p = 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=0){
				nums[p] = nums[i];
				p++;
			}
		}
		for(int i=p;i<nums.length;i++){
			nums[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		moveZeroes(new int[]{0,1,0,3,12});
	}
}
