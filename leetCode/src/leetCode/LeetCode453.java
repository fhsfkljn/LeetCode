package leetCode;

//453. Minimum Moves to Equal Array Elements
/**
 * ����һ������Ϊ n �ķǿ��������飬�ҵ�����������Ԫ����ȵ���С�ƶ�������ÿ���ƶ�����ʹ n - 1 ��Ԫ������ 1��
 * 
 * @author 89591
 *
 */
public class LeetCode453 {

	public int minMoves(int[] nums) {
		if(nums==null || nums.length==0) return 0;
		int min = nums[0];
		int res = 0;
		for(int n : nums) min = Math.min(min, n);
		for(int n : nums) res += n-min;
		return res;
	}

}
