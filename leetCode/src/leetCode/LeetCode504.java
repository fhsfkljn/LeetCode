package leetCode;

//504. Base 7
/**
 * 给定一个整数，将其转化为7进制，并以字符串形式输出。
 * 
 * @author 89591
 *
 */
public class LeetCode504 {
	
	public static String convertToBase7(int num) {
		return Integer.toString(num, 7);
	}
	
	public static void main(String[] args) {
		System.out.println(convertToBase7(0));
	}
}
