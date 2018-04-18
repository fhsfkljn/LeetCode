package leetCode;

//342. Power of Four
/**
 * 给定一个整数 (32位有符整数型)，请写出一个函数来检验它是否是4的幂。
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
