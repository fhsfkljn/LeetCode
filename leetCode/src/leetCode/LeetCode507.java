package leetCode;

//507. Perfect Number
/**
 * 对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。
 * 
 * 给定一个 正整数 n， 如果他是完美数，返回 True，否则返回 False
 * 
 * @author 89591
 *
 */
public class LeetCode507 {
	
	public boolean checkPerfectNumber(int num) {
		//{6, 28, 496, 8128, 33550336};
		if(num==6 || num==28 || num==496 || num==8128 || num==33550336) return true;
		else return false;
	}
}
