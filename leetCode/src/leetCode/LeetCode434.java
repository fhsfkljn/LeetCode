package leetCode;

//434. Number of Segments in a String
/**
 * 统计字符串中的单词个数，这里的单词指的是连续的非空字符。
 * 
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 * 
 * @author 89591
 *
 */
public class LeetCode434 {
	
	public static int countSegments(String s) {
		return ("a " + s).split(" +").length - 1;
	}
	
	public static void main(String[] args) {
		System.out.println(countSegments(" my name is John"));
	}
}
