package leetCode;

//190. Reverse Bits
/**
 * �ߵ�������32λ�޷��������Ķ�����λ��
 * 
 * ���磬�������� 43261596�������Ʊ�ʾΪ 00000010100101000001111010011100 ��������
 * 964176192�������Ʊ�ʾΪ 00111001011110000010100101000000����
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
