package leetCode;

//326. Power of Three
/**
 * 给出一个整数，写一个函数来确定这个数是不是3的一个幂。
 * 
 * @author 89591
 *
 */
public class LeetCode326 {
	public boolean isPowerOfThree(int n) {
		// 1162261467 is 3^19, 3^20 is bigger than int
		return (n > 0 && 1162261467 % n == 0);
	}
}
