package leetCode;

//263. Ugly Number
/**
 * 编写程序判断给定的数是否为丑数。
 * 
 * 丑数就是只包含质因子 2, 3, 5 的正整数。例如， 6, 8 是丑数，而 14 不是，因为它包含了另外一个质因子 7。
 * 
 * @author 89591
 *
 */
public class LeetCode263 {
	
	public boolean isUgly(int num) {
		for(int i=2;i<6 && num>0;i++){
			while(num%i==0) num /= i;
		}
		return num==0;
	}
}
