package leetCode;

//342. Power of Four
/**
 * ����һ������ (32λ�з�������)����д��һ���������������Ƿ���4���ݡ�
 * @author 89591
 *
 */
public class LeetCode342 {
	public boolean isPowerOfFour(int num) {
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
        //0x55555555 is to get rid of those power of 2 but not power of 4
        //so that the single 1 bit always appears at the odd position 
    }
}
