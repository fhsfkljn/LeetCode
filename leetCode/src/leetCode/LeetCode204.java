package leetCode;

//204. Count Primes
/**
 * 计算所有小于非负数整数 n 的质数数量。
 * 
 * @author 89591
 *
 */
public class LeetCode204 {

	public int countPrimes(int n) {
		boolean[] notPrime = new boolean[n];
		int count = 0;
		for(int i=2;i<n;i++){
			if(notPrime[i]==false) count++;
			for(int j=2;i*j<n;j++){
				notPrime[i*j] = true;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		boolean[] is = new boolean[10];
		for (boolean b : is) {
			System.out.println(b);
		}
	}
}
