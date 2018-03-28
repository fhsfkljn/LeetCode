package leetCode;

//35. Search Insert Position
//¶ş·Ö²éÕÒ
public class LeetCode35 {
	public int searchInsert(int[] nums, int target) {
		int low = 0,high = nums.length-1;
		while(low<=high){
			int mid = low+(high-low)/2;
			if(nums[mid]==target) return mid;
			else if(target<nums[mid]) high = mid-1;
			else low = mid+1;
		}
		return low;
	}
}
