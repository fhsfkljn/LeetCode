package leetCode;

//504. Base 7
/**
 * ����һ������������ת��Ϊ7���ƣ������ַ�����ʽ�����
 * 
 * @author 89591
 *
 */
public class LeetCode504 {
	
	public static String convertToBase7(int num) {
		return Integer.toString(num, 7);
	}
	
	public static void main(String[] args) {
		System.out.println(convertToBase7(0));
	}
}
