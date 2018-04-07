package leetCode;

//171. Excel Sheet Column Number
/**
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * 
 * @author 89591
 *
 */
public class LeetCode171 {
	
	public int titleToNumber(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); result = result * 26 + (s.charAt(i) - 'A' + 1), i++);
		return result;
	}
}
