package leetCode;

//69. Sqrt(x)
public class LeetCode69 {
	public static int mySqrt(int x) {
		long r = x;
		while(r*r>x){
			r = (r+x/r)/2;
		}
		return (int)r;
	}
	
	public static void main(String[] args) {
		System.out.println(mySqrt(17));
	}
}
