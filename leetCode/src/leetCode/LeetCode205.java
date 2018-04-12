package leetCode;

//205. Isomorphic Strings
/**
 * ���������ַ��� s �� t���ж������Ƿ���ͬ���ġ�
 * 
 * ��� s �е��ַ����Ա��滻���ձ�� t ���������ַ�����ͬ���ġ�
 * 
 * ���г��ֵ��ַ�����������һ���ַ��滻��ͬʱ�����ַ���˳�������ַ�����ӳ�䵽ͬһ���ַ��ϣ����ַ�����ӳ���Լ�����
 * 
 * ���磬
 * 
 * ���� "egg", "add", ���� true.
 * 
 * ���� "foo", "bar", ���� false.
 * 
 * ���� "paper", "title", ���� true.
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
