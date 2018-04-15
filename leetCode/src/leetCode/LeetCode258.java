package leetCode;

//258. Add Digits
/**
 * 给一个非负整数 num，反复添加所有的数字，直到结果只有一个数字。
 * 
 * 例如:
 * 
 * 设定 num = 38，过程就像： 3 + 8 = 11, 1 + 1 = 2。 由于 2 只有1个数字，所以返回它。
 * 
 * @author 89591
 *
 */
public class LeetCode258 {
	
	public int addDigits(int num) {
		return 1 + (num - 1) % 9;
	}
}
