package leetCode;

//136. Single Number
//������Բ������ķ�ʽ��A XOR A = 0���������е�ÿһ��Ԫ�ض�����������һ�����Ǹ�Ψһ������0��򣬽������Ψһ����
public class LeetCode136 {
	public int singleNumber(int[] nums) {
		int result = 0;
		for(int i=0;i<nums.length;i++){
			result ^= nums[i];
		}
		return result;
	}
}
