package leetCode;

//326. Power of Three
/**
 * ����һ��������дһ��������ȷ��������ǲ���3��һ���ݡ�
 * 
 * @author 89591
 *
 */
public class LeetCode326 {
	public boolean isPowerOfThree(int n) {
		// 1162261467 is 3^19, 3^20 is bigger than int
		return (n > 0 && 1162261467 % n == 0);
	}
}
