package leetCode;

//633. Sum of Square Numbers
/**
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
 * 
 * @author 89591
 *
 */
public class LeetCode633 {
	
	public static boolean judgeSquareSum(int c) {
		if(c<0) return false;
		int left = 0,right = (int)Math.sqrt(c);
		while(left<=right){
			int record = left*left + right*right;
			if(record>c) right--;
			else if(record<c) left++;
			else return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(judgeSquareSum(64));
	}
}
