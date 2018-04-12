package leetCode;

//205. Isomorphic Strings
/**
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * 
 * 如果 s 中的字符可以被替换最终变成 t ，则两个字符串是同构的。
 * 
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 * 
 * 例如，
 * 
 * 给定 "egg", "add", 返回 true.
 * 
 * 给定 "foo", "bar", 返回 false.
 * 
 * 给定 "paper", "title", 返回 true.
 * 
 * @author 89591
 *
 */
public class LeetCode205 {
	
	public boolean isIsomorphic(String s, String t) {
		int[] ref = new int[512];
		for(int i=0;i<s.length();i++){
			if(ref[s.charAt(i)]!=ref[t.charAt(i)+256]) return false;
			ref[s.charAt(i)] = ref[t.charAt(i)+256] = i+1;
		}
		return true;
	}
}
