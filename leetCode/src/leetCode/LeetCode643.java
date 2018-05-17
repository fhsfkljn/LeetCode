package leetCode;

//643. Maximum Average Subarray I
/**
 * ���� n ���������ҳ�ƽ��������ҳ���Ϊ k �����������飬����������ƽ������
 * 
 * @author 89591
 *
 */
public class LeetCode643 {
	
	public static double findMaxAverage(int[] nums, int k) {
		for(int i=1;i<nums.length;i++){
			nums[i] = nums[i] + nums[i-1];
		}
		double max = nums[k-1];
		for(int i=1;i<nums.length-k+1;i++){
			max = Math.max(nums[i+k-1]-nums[i-1], max);
		}
		return max/k;
	}
	
	public static void main(String[] args) {
		System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
	}
}
