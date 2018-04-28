package leetCode;

//461. Hamming Distance
/**
 * ��������֮��ĺ�������ָ�������������ֶ�Ӧ������λ��ͬ��λ�õ���Ŀ��
 * 
 * ������������ x �� y����������֮��ĺ������롣
 * 
 * @author 89591
 *
 */
public class LeetCode461 {
	 public int hammingDistance(int x, int y) {
	        int xor = x ^ y, count = 0;
	        for (int i=0;i<32;i++) count += (xor >> i) & 1;
	            return count;
	    }
}
