package leetCode;

import java.util.HashSet;
import java.util.Set;

//409. Longest Palindrome
/**
 * ����һ��������д��ĸ��Сд��ĸ���ַ������ҵ�ͨ����Щ��ĸ����ɵ���Ļ��Ĵ���
 * 
 * �ڹ�������У���ע�����ִ�Сд������ "Aa" ���ܵ���һ�������ַ�����
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
