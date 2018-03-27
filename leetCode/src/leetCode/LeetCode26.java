package leetCode;

//26. Remove Duplicates from Sorted Array
//依次判断后一个数是否比前一个数大（数组有序），如果是的话就将count++即可
public class LeetCode26 {
	public int removeDuplicates(int[] nums) {
		int count = 1;
		for(int i=1;i<nums.length;i++){
			if(nums[i]>nums[i-1]) nums[count++] = nums[i];
		}
		return count;
	}
}
