package leetCode;

//172. Factorial Trailing Zeroes
/**
 * ����һ������ n������ n! ���β�����������,�ж�5����������
 * 
 * @author 89591
 *
 */
public class LeetCode172 {
	
	public int trailingZeroes(int n) {
		return n==0 ? 0 : (n/5) + trailingZeroes(n/5);
	}
}
