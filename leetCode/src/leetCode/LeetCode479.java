package leetCode;

//79. Largest Palindrome Product
/**
 * ����Ҫ�ҵ������� n λ���ĳ˻���ɵ�����������
 * 
 * ���ڽ����ܴ���ֻ�践���������� mod 1337�õ��Ľ����
 * 
 * @author 89591
 *
 */
public class LeetCode479 {

	long[] tens = new long[] { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000 };

	long getReverse(long num, int n) {
		long ret = 0;
		for (int i = 1; i <= n; i++) {
			ret += (num % 10) * tens[n - i];
			num /= 10;
		}
		return ret;
	}

	public int largestPalindrome(int n) {
		if (n == 1)
			return 9;
		long ret = 0, max = tens[n], min = tens[n - 1];
		for (long i = max - 1; i > 0; i--) {
			ret = i * max + getReverse(i, n);
			for (long factor = (long) Math.sqrt(ret); factor < max; factor++)
				if (ret % factor == 0 && ret / factor < max)
					return (int) (ret % 1337);
		}
		return -1;
	}
}
