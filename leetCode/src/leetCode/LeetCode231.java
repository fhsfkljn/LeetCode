package leetCode;

//231. Power of Two
/**
 * ����һ��������дһ���������ж����Ƿ���2���ݡ�
 * 
 * @author 89591
 *
 */
public class LeetCode231 {
	
	public static boolean isPowerOfTwo(int n) {
		if(n<=0) return false;
		return (n&(n-1)) == 0;
	}
	
	public static void main(String[] args) {
		System.out.println();
	}
}
