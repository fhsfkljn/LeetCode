package leetCode;

import java.util.HashSet;
import java.util.Set;

//409. Longest Palindrome
/**
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * 
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 * 
 * @author 89591
 *
 */
public class LeetCode409 {
	
	public int longestPalindrome(String s) {
		Set<Character> record = new HashSet<>();
		int count = 0;
		for(char c : s.toCharArray()){
			if(record.contains(c)){
				record.remove(c);
				count++;
			}else {
				record.add(c);
			}
		}
		if(!record.isEmpty()) return 2*count+1;
		else return 2*count;
	}
}
