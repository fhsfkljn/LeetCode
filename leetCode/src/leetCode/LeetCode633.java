package leetCode;

//633. Sum of Square Numbers
/**
 * ����һ���Ǹ����� c ����Ҫ�ж��Ƿ������������ a �� b��ʹ�� a2 + b2 = c��
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
