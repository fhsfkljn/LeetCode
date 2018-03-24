package leetCode;

//136. Single Number
//本题可以采用异或的方式，A XOR A = 0，将数组中的每一个元素都进行异或，最后一定是那个唯一的数与0异或，结果等于唯一的数
public class LeetCode136 {
	public int singleNumber(int[] nums) {
		int result = 0;
		for(int i=0;i<nums.length;i++){
			result ^= nums[i];
		}
		return result;
	}
}
