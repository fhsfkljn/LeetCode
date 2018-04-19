package leetCode;

//367. Valid Perfect Square
/**
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 * 
 * @author 89591
 *
 */
public class LeetCode367 {
	public static boolean isPerfectSquare(int num) {
		int i = 1;
		while (num > 0) {
			num -= i;
			i += 2;
		}
		return num == 0;
	}

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(isPerfectSquare(Integer.MAX_VALUE));
		// System.out.println(Math.sqrt(Integer.MAX_VALUE));
	}
}
