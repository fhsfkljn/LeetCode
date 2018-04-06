package leetCode;

//168. Excel Sheet Column Title
/**
 * 给定一个正整数，返回它在Excel表中相对应的列名称。
 * 
 * @author 89591
 *
 */
public class LeetCode168 {
	public String convertToTitle(int n) {
		return n==0 ? "" : convertToTitle(--n/26) + (char)('A'+(n%26));
	}
}
