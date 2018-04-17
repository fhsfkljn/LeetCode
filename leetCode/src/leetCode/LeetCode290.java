package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.zip.Inflater;

//290. Word Pattern
/**
 * ����һ�� pattern(ģʽ) ��һ���ַ��� str ���ж� str �Ƿ���ѭ����ģʽ��
 * 
 * ����� ��ѭ ָ��ȫƥ�䣬������pattern���ÿ����ĸ���ַ��� str �е�ÿ���ǿյ��ʴ���˫��ӳ���ϵ��
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
