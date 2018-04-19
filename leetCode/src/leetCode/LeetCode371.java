package leetCode;

//371. Sum of Two Integers
/**
 * 不使用运算符 + 和-，计算两整数a 、b之和。
 * 
 * @author 89591
 *
 */
public class LeetCode371 {
	
	public static int getSum(int a, int b) {
		if (a == 0) return b;
		if (b == 0) return a;

		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println(getSum(1, 3));
	}
}
