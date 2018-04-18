package leetCode;

//344. Reverse String
/**
 * 请编写一个函数，其功能是将输入的字符串反转过来。
 * 
 * @author 89591
 *
 */
public class LeetCode344 {
	public String reverseString(String s) {
		return new StringBuffer(s).reverse().toString();
	}
}
