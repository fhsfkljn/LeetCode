package leetCode;

//459. Repeated Substring Pattern
/**
 * ����һ���ǿյ��ַ������ж����Ƿ����������һ���Ӵ��ظ���ι��ɡ��������ַ���ֻ����СдӢ����ĸ�����ҳ��Ȳ�����10000��
 * 
 * @author 89591
 *
 */
public class LeetCode459 {
	
	public static boolean repeatedSubstringPattern(String s) {
		StringBuilder str = new StringBuilder(s+s);
		str.deleteCharAt(0);
		str.deleteCharAt(str.length()-1);
		return str.toString().contains(s);
	}
	
	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("abab"));
	}
}
