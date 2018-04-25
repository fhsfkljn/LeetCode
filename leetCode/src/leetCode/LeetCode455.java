package leetCode;

import java.util.Arrays;

//455. Assign Cookies
/**
 * ��������һλ�ܰ��ļҳ�����Ҫ����ĺ�����һЩС���ɡ����ǣ�ÿ���������ֻ�ܸ�һ����ɡ���ÿ������ i ������һ��θ��ֵ gi
 * ���������ú���������θ�ڵı��ɵ���С�ߴ磻����ÿ����� j ������һ���ߴ� sj ����� sj >= gi �����ǿ��Խ�������� j ��������� i
 * ��������ӻ�õ����㡣���Ŀ���Ǿ���������Խ�������ĺ��ӣ��������������ֵ��
 * 
 * @author 89591
 *
 */
public class LeetCode455 {
	
	public static int findContentChildren(int[] children, int[] cookies) {
		Arrays.sort(children);
		Arrays.sort(cookies);
		int child = 0;
		for(int cookie=0;child<children.length && cookie<cookies.length;cookie++){
			if(children[child]<=cookies[cookie]) child++;
		}
		return child;
	}
}
