package leetCode;

//383. Ransom Note
/**
 * 给定一个赎金信 (ransom)
 * 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true
 * ；否则返回 false。
 * 
 * @author 89591
 *
 */
public class LeetCode383 {
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		int[] record = new int[26];
		for(char c:magazine.toCharArray()){
			record[c-'a']++;
		}
		for(char c:ransomNote.toCharArray()){
			if(--record[c-'a']<0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(canConstruct("aa", "ab"));
	}
}
