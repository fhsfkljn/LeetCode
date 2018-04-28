package leetCode;

//461. Hamming Distance
/**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
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
