package leetCode;

//125. Valid Palindrome
/**
 * 
 * 给定一个字符串，确定它是否是回文，只考虑字母数字字符和忽略大小写。
 * 
 * @author 89591
 *
 */
public class LeetCode125 {
	public static boolean isPalindrome(String s) {
		if (s == null)
			return true;
		s = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
		System.out.println(s);
		return s.equals(new StringBuffer(s).reverse().toString());
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
}
