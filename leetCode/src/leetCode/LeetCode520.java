package leetCode;

//520. Detect Capital
/**
 * ����һ�����ʣ�����Ҫ�жϵ��ʵĴ�дʹ���Ƿ���ȷ��
 * 
 * ���Ƕ��壬���������ʱ�����ʵĴ�д�÷�����ȷ�ģ�
 * 
 * ȫ����ĸ���Ǵ�д������"USA"�� ������������ĸ�����Ǵ�д������"leetcode"�� ������ʲ�ֻ����һ����ĸ��ֻ������ĸ��д�� ����
 * "Google"�� �������Ƕ����������û����ȷʹ�ô�д��ĸ��
 * 
 * @author 89591
 *
 */
public class LeetCode520 {
	
	public static boolean detectCapitalUse(String word) {
		return word.matches("([A-Z][a-z]*)|([a-z]+)|([A-Z]+)");
	}
	
	public static void main(String[] args) {
		System.out.println(detectCapitalUse("usa"));
	}
}
