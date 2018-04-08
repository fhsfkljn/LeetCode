package leetCode;

//190. Reverse Bits
/**
 * 颠倒给定的32位无符号整数的二进制位。
 * 
 * 例如，给定输入 43261596（二进制表示为 00000010100101000001111010011100 ），返回
 * 964176192（二进制表示为 00111001011110000010100101000000）。
 * 
 * @author 89591
 *
 */
public class LeetCode190 {
	
	public int reverseBits(int n) {
		if (n == 0) return 0;
	    
	    int result = 0;
	    for (int i = 0; i < 32; i++) {
	        result <<= 1;
	        if ((n & 1) == 1) result++;
	        n >>= 1;
	    }
	    return result;
	}
}
