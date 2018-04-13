package leetCode;

//231. Power of Two
/**
 * 给定一个整数，写一个函数来判断它是否是2的幂。
 * 
 * @author 89591
 *
 */
public class LeetCode231 {
	
	public static boolean isPowerOfTwo(int n) {
		if(n<=0) return false;
		return (n&(n-1)) == 0;
	}
	
	public static void main(String[] args) {
		System.out.println();
	}
}
