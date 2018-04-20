package leetCode;

//387. First Unique Character in a String
/**
 * ����һ���ַ������ҵ����ĵ�һ�����ظ����ַ���������������������������ڣ��򷵻�
 * -1������һ���ַ������ҵ����ĵ�һ�����ظ����ַ���������������������������ڣ��򷵻� -1��
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
