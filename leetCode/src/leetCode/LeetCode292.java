package leetCode;

//292. Nim Game
//此题非常简单，只要不是4的倍数，就肯定能赢
public class LeetCode292 {
	public boolean canWinNim(int n) {
		return n%4 != 0;
	}
}
