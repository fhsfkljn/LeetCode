package leetCode;

//172. Factorial Trailing Zeroes
/**
 * 给定一个整数 n，返回 n! 结果尾数中零的数量,判断5的数量即可
 * 
 * @author 89591
 *
 */
public class LeetCode172 {
	
	public int trailingZeroes(int n) {
		return n==0 ? 0 : (n/5) + trailingZeroes(n/5);
	}
}
