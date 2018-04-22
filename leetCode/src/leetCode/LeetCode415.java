package leetCode;

//415. Add Strings
/**
 * ���������ַ�����ʽ�ķǸ����� num1 ��num2 ���������ǵĺ͡�
 * 
 * @author 89591
 *
 */
public class LeetCode415 {

	public static String addStrings(String num1, String num2) {
		String res = "";
		int carry = 0;
		for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--) {
			int a = i < 0 ? 0 : num1.charAt(i)-'0';
			int b = j < 0 ? 0 : num2.charAt(j)-'0';
			res = ((a+b+carry)%10) + res;
			carry = (a+b+carry)/10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(addStrings("123", "789"));
	}
}
