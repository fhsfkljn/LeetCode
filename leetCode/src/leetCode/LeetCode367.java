package leetCode;

//367. Valid Perfect Square
/**
 * ����һ�������� num����дһ����������� num ��һ����ȫƽ�������򷵻� True�����򷵻� False��
 * 
 * @author 89591
 *
 */
public class LeetCode367 {
	public static boolean isPerfectSquare(int num) {
		int i = 1;
		while (num > 0) {
			num -= i;
			i += 2;
		}
		return num == 0;
	}

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(isPerfectSquare(Integer.MAX_VALUE));
		// System.out.println(Math.sqrt(Integer.MAX_VALUE));
	}
}
