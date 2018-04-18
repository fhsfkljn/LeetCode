package leetCode;

//345. Reverse Vowels of a String
/**
 * ��дһ�����������ַ�����Ϊ���룬��ת���ַ����е�Ԫ����ĸ��
 * 
 * @author 89591
 *
 */
public class LeetCode345 {
	
	public static String reverseVowels(String s) {
		if(s==null || s.length()==0) return "";
		char[] c = s.toCharArray();
		String vowels = "aeiouAEIOU";
		int start = 0,end = s.length()-1;
		while(start<end){
			while(start<end && !vowels.contains(c[start]+"")) start++;
			while(start<end && !vowels.contains(c[end]+"")) end--;
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			start++;
			end--;
		}
		return new String(c);
	}
	
	public static void main(String[] args) {
		System.out.println(reverseVowels("leetcode"));
	}
}
