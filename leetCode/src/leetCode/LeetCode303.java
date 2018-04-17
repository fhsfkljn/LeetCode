package leetCode;

//303. Range Sum Query - Immutable
/**
 * ����һ�����飬������������ i �� j (i �� j) ��Χ��Ԫ�ص��ܺͣ����� i, j ���㡣
 * 
 * @author 89591
 *
 */
public class LeetCode303 {
	
	int[] nums;

	public LeetCode303(int[] nums) {
	    for(int i = 1; i < nums.length; i++)
	        nums[i] += nums[i - 1];
	    
	    this.nums = nums;
	}

	public int sumRange(int i, int j) {
	    if(i == 0)
	        return nums[j];
	    
	    return nums[j] - nums[i - 1];
	}
}
