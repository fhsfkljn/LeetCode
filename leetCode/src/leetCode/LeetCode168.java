package leetCode;

//168. Excel Sheet Column Title
/**
 * ����һ������������������Excel�������Ӧ�������ơ�
 * 
 * @author 89591
 *
 */
public class LeetCode168 {
	public String convertToTitle(int n) {
		return n==0 ? "" : convertToTitle(--n/26) + (char)('A'+(n%26));
	}
}
