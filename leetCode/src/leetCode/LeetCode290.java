package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.zip.Inflater;

//290. Word Pattern
/**
 * 给定一种 pattern(模式) 和一个字符串 str ，判断 str 是否遵循这种模式。
 * 
 * 这里的 遵循 指完全匹配，例如在pattern里的每个字母和字符串 str 中的每个非空单词存在双向单映射关系。
 * 
 * @author 89591
 *
 */
public class LeetCode290 {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean wordPattern(String pattern, String str) {
		String[] words = str.split(" ");
	    if (words.length != pattern.length())
	        return false;
	    Map index = new HashMap();
	    for (Integer i=0; i<words.length; ++i){
	    	Object a = index.put(pattern.charAt(i), i);
	    	Object b = index.put(words[i], i);
	    	System.out.println(a);
	    	System.out.println(b);
	    	if (a != b)
	            return false;
	    }
	        
	    return true;
	}
	
	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat fish"));
	}
}
