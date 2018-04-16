package leetCode;

//268. Missing Number
/**
 * ����һ������ 0, 1, 2, ..., n �� n ���������У��ҳ� 0 .. n ��û�г����������е��Ǹ�����
 * 
 * @author 89591
 *
 */
public class LeetCode268 {
	
	public int missingNumber(int[] nums) {
		int sum = (nums.length+1)*nums.length/2;
		for(int n : nums) sum -= n;
		return sum;
	}
}
