package leetCode;

//67. Add Binary
public class LeetCode67 {
	
	public static String addBinary(String a, String b) {
//		int num1 = Integer.valueOf(a,2);
//		int num2 = Integer.valueOf(b,2);
//		int sum = num1 + num2;
//		return Integer.toBinaryString(sum);
		
		StringBuilder sum = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		while (i >= 0 || j >= 0 || carry == 1) {
			int digitA = i < 0 ? 0 : a.charAt(i--) - '0';
			int digitB = j < 0 ? 0 : b.charAt(j--) - '0';
			sum.insert(0, (digitA + digitB + carry) % 2);
			carry = (digitA + digitB + carry) / 2;
		}
		return sum.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(addBinary("11", "1"));
	}
}
