package leetCode;

//551. Student Attendance Record I
/**
 * ����һ���ַ���������һ��ѧ���ĳ��ڼ�¼�������¼���������������ַ���
 * 
 * 'A' : Absent��ȱ�� 'L' : Late���ٵ� 'P' : Present������
 * ���һ��ѧ���ĳ��ڼ�¼�в�����һ��'A'(ȱ��)���Ҳ���������������'L'(�ٵ�),��ô���ѧ���ᱻ���͡�
 * 
 * ����Ҫ�������ѧ���ĳ��ڼ�¼�ж����Ƿ�ᱻ���͡�
 * 
 * @author 89591
 *
 */
public class LeetCode551 {
	
	public static boolean checkRecord(String s) {
		if(s.contains("LLL")) return false;
		int countA = 0;
		for(char c : s.toCharArray()){
			if(c == 'A') countA++;
		}
		return countA <= 1;
	}
	
	public static void main(String[] args) {
		System.out.println(checkRecord("APALLLLLP"));
	}
}
