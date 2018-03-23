package leetCode;

public class LeetCode693 {

	public boolean hasAlternatingBits(int n) {
		return (((long) n + (n >> 1) + 1) & ((long) n + (n >> 1))) == 0;
	}

	public static void main(String[] args) {
		int n = 85;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString((n >> 1)));
		System.out.println(Integer.toBinaryString((int) ((long) n + (n >> 1) + 1)));
		System.out.println(Integer.toBinaryString((int) ((long) n + (n >> 1))));
		System.out.println(((long) n + (n >> 1)) & ((long) n + (n >> 1) + 1));

	}
}
