package leetCode;

//400. Nth Digit
/**
 * 在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 个数字。
 * 
 * @author 89591
 *
 */
public class LeetCode400 {

	public static int findNthDigit(int n) {
		int len = 1;
		int start = 1;
		long count = 9;
		
		while(n>len*count){
			n -= len*count;
			len++;
			count *= 10;
			start *= 10;
		}
		start += (n-1)/len;
		String str = Integer.toString(start);
		return Character.getNumericValue(str.charAt((n-1)%len));
	}
	
	public static void main(String[] args) {
		System.out.println(findNthDigit(11));
	}
}
