package leetCode;

//14. Longest Common Prefix
//此题可以这样来求解，首先取数组中的第一个字符串，看后来的字符串是否包含此字符串并且该字符串位于开头，如果不是，则将开头字符串末尾的字符
//截去，然后继续判断
public class leetCode14 {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		String pre = strs[0];
		int i = 1;
		while(i<strs.length){
			while(strs[i].indexOf(pre) != 0){
				pre = pre.substring(0, pre.length()-1);
			}
			i++;
			if(pre.length()==0){
				break;
			}
		}
		return pre;
	}
	
	public static void main(String[] args) {
		String[] strs = {"abcd","dbabc"};
		System.out.println(new leetCode14().longestCommonPrefix(strs));
	}
}
