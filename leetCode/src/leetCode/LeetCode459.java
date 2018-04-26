package leetCode;

//459. Repeated Substring Pattern
/**
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 * 
 * @author 89591
 *
 */
public class LeetCode459 {
	
	public static boolean repeatedSubstringPattern(String s) {
		StringBuilder str = new StringBuilder(s+s);
		str.deleteCharAt(0);
		str.deleteCharAt(str.length()-1);
		return str.toString().contains(s);
	}
	
	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("abab"));
	}
}
