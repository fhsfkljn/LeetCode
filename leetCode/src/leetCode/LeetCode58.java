package leetCode;

//58. Length of Last Word
public class LeetCode58 {
	public int lengthOfLastWord(String s) {
		return s.trim().length()-s.trim().lastIndexOf(" ")-1;
	}
}
