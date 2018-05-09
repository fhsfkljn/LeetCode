package leetCode;

//541. Reverse String II
/**
 * 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k
 * 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。
 */
public class LeetCode541 {
	
	public String reverseStr(String s, int k) {
        char[] charArr = s.toCharArray();
        for(int i = 0; i < charArr.length; i += 2 * k) {
            int end = (i + k - 1) > (charArr.length - 1) ? (charArr.length - 1) : (i + k - 1) ;
            reverse(charArr, i, end);
        }
        return new String(charArr);
    }
    
    public void reverse(char[] charArr, int start, int end) {
        while(start < end) {
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;
            ++start; --end;
        }
    }
}
