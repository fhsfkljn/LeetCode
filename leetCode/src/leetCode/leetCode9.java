package leetCode;

//9. Palindrome Number
//类似于整数的反转，将整数反转之后，再进行比较即可
public class leetCode9 {
	public boolean isPalindrome(int x) {
		if (x < 0 || (x != 0 && x % 10 == 0))
			return false;
		int n = x;
		int rev = 0;
		while (x != 0) {
			rev = rev * 10 + x % 10;
			x = x / 10;
		}
		
		return n==rev;
	}
}
