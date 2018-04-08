package leetCode;

//191. Number of 1 Bits
/**
 * 编写一个函数，输入是一个无符号整数，返回的是它所有 位1 的个数（也被称为汉明重量）。
 * 
 * 例如，32位整数 '11' 的二进制表示为 00000000000000000000000000001011，所以函数返回3。
 * 
 * @author 89591
 *
 */
public class LeetCode191 {

	public static int hammingWeight(int n) {
		int ones = 0;
		while (n != 0) {
			ones = ones + (n & 1);
			n = n >>> 1;
		}
		return ones;
	}

	public static void main(String[] args) {
		System.out.println(11 >>> 1);
	}
}
