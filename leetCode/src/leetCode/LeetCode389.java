package leetCode;

//389. Find the Difference
/**
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * 
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 
 * 请找出在 t 中被添加的字母。
 * 
 * @author 89591
 *
 */
public class LeetCode389 {
	
	public static char findTheDifference(String s, String t) {
		int record = 0;
		for(int i=0;i<s.length();i++){
			record += t.charAt(i);
			record -= s.charAt(i);
		}
		record += t.charAt(t.length()-1);
		return (char)record;
	}
	
	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd", "abcde"));
	}
}
