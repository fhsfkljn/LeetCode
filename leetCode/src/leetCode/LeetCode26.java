package leetCode;

//26. Remove Duplicates from Sorted Array
//�����жϺ�һ�����Ƿ��ǰһ�������������򣩣�����ǵĻ��ͽ�count++����
public class LeetCode26 {
	public int removeDuplicates(int[] nums) {
		int count = 1;
		for(int i=1;i<nums.length;i++){
			if(nums[i]>nums[i-1]) nums[count++] = nums[i];
		}
		return count;
	}
}
