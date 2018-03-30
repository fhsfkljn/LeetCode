package leetCode;

//70. Climbing Stairs
//典型的斐波那契数列，以下提供了递归与非递归两种方法
public class LeetCode70 {
	public static int climbStairs(int n) {
		//递归
//		if(n<=3){
//			return n;
//		}
//		return climbStairs(n-1)+climbStairs(n-2);
		
		//非递归
		if(n<=3){
			return n;
		}
		
		int first = 2;
		int second = 3;
		int sum = 0;
		for(int i=4;i<=n;i++){
			sum = first + second;
			first = second;
			second = sum;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		System.out.println(climbStairs(5));
	}
}
