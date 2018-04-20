package leetCode;

//387. First Unique Character in a String
/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回
 * -1。给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 
 * @author 89591
 *
 */
public class LeetCode387 {
	
	public int firstUniqChar(String s) {
		int[] record = new int[26];
		for (char c : s.toCharArray()) {
			record[c-'a']++;
		}
		for(int i=0;i<s.length();i++){
			if(record[s.charAt(i)-'a']==1) return i;
		}
		return -1;
	}
}
