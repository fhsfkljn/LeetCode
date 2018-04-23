package leetCode;

import java.util.ArrayList;
import java.util.List;

//438. Find All Anagrams in a String
/**
 * Given a string s and a non-empty string p, find all the start indices of p's
 * anagrams in s.
 * 
 * Strings consists of lowercase English letters only and the length of both
 * strings s and p will not be larger than 20,100.
 * 
 * The order of output does not matter.
 * 
 * @author 89591
 *
 */
public class LeetCode438 {

	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> res = new ArrayList<>();
		if (s == null || s.length() == 0 || p == null || p.length() == 0)
			return res;
		int[] record = new int[256];
		for (char c : p.toCharArray())
			record[c]++;
		int left = 0, right = 0, count = p.length();
		while(right<s.length()){
			if(record[s.charAt(right++)]-- >= 1) count--;
			if(count==0) res.add(left);
			if(right-left==p.length() && record[s.charAt(left++)]++ >= 0) count++;
		}
		return res;
	}

	public static void main(String[] args) {
		List<Integer> res = findAnagrams("cbaebabacd", "abc");
		for (Integer integer : res) {
			System.out.println(integer);
		}
	}
}
