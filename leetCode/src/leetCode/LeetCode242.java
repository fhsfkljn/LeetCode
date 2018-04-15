package leetCode;

//242. Valid Anagram
/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * 
 * 例如， s = "anagram"，t = "nagaram"，返回 true s = "rat"，t = "car"，返回 false
 * 
 * @author 89591
 *
 */
public class LeetCode242 {
	
	public boolean isAnagram(String s, String t) {
		if(s==null || t==null || s.length()!=t.length()) return false;
		int[] a = new int[26];
		for(int i=0;i<s.length();i++){
			a[s.charAt(i)-'a']++;
			a[t.charAt(i)-'a']--;
		}
		for(int i=0;i<26;i++){
			if(a[i]!=0) return false;
		}
		return true;
	}
}
