package leetCode;

//383. Ransom Note
/**
 * ����һ������� (ransom)
 * �ַ�����һ����־(magazine)�ַ������жϵ�һ���ַ���ransom�ܲ����ɵڶ����ַ���magazines������ַ����ɡ�������Թ��ɣ����� true
 * �����򷵻� false��
 * 
 * @author 89591
 *
 */
public class LeetCode383 {
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		int[] record = new int[26];
		for(char c:magazine.toCharArray()){
			record[c-'a']++;
		}
		for(char c:ransomNote.toCharArray()){
			if(--record[c-'a']<0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(canConstruct("aa", "ab"));
	}
}
