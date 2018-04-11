package leetCode;

import java.util.HashSet;
import java.util.Set;

//202. Happy Number
/**
 * 写一个算法来判断一个数是不是“快乐数”。
 * 
 * 一个数是不是快乐是这么定义的：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，或是无限循环但始终变不到
 * 1。如果可以变为 1，那么这个数就是快乐数。
 * 
 * @author 89591
 *
 */
public class LeetCode202 {
	
	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		while(set.add(n)){
			int next = 0;
			int temp = 0;
			while(n>0){
				temp = n%10;
				next += temp*temp;
				n /= 10;
			}
			if(next==1) return true;
			n = next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isHappy(18));
	}
}
