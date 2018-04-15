package leetCode;

//242. Valid Anagram
/**
 * ���������ַ��� s �� t ����дһ���������ж� t �Ƿ��� s ��һ����ĸ��λ�ʡ�
 * 
 * ���磬 s = "anagram"��t = "nagaram"������ true s = "rat"��t = "car"������ false
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
