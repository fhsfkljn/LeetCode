package leetCode;

//374. Guess Number Higher or Lower
/**
 * 我们正在玩一个猜数字游戏。 游戏规则如下： 我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。 每次你猜错了，我会告诉你这个数字是大了还是小了。
 * 你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）：
 * 
 * @author 89591
 *
 */
public class LeetCode374 {
	
	public int guessNumber(int n) {
		int low = 1,high = n;
		while(low<high){
			int mid = low + (high-low)/2;
			if(guess(mid)==0) return mid;
			else if(guess(mid)==1) low = mid+1;
			else high = mid-1;
		}
		return low;
	}

	private int guess(int mid) {
		// TODO Auto-generated method stub
		return 0;
	}
}
