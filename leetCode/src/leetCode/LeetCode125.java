package leetCode;

//125. Valid Palindrome
/**
 * 
 * ����һ���ַ�����ȷ�����Ƿ��ǻ��ģ�ֻ������ĸ�����ַ��ͺ��Դ�Сд��
 * 
 * @author 89591
 *
 */
public class LeetCode125 {
	public static boolean isPalindrome(String s) {
		if (s == null)
			return true;
		s = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
		System.out.println(s);
		return s.equals(new StringBuffer(s).reverse().toString());
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
}
