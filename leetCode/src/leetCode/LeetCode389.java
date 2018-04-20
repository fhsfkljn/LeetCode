package leetCode;

//389. Find the Difference
/**
 * ���������ַ��� s �� t������ֻ����Сд��ĸ��
 * 
 * �ַ��� t ���ַ��� s ������ţ�Ȼ�������λ�����һ����ĸ��
 * 
 * ���ҳ��� t �б���ӵ���ĸ��
 * 
 * @author 89591
 *
 */
public class LeetCode389 {
	
	public static char findTheDifference(String s, String t) {
		int record = 0;
		for(int i=0;i<s.length();i++){
			record += t.charAt(i);
			record -= s.charAt(i);
		}
		record += t.charAt(t.length()-1);
		return (char)record;
	}
	
	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd", "abcde"));
	}
}
