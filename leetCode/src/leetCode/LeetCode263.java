package leetCode;

//263. Ugly Number
/**
 * ��д�����жϸ��������Ƿ�Ϊ������
 * 
 * ��������ֻ���������� 2, 3, 5 �������������磬 6, 8 �ǳ������� 14 ���ǣ���Ϊ������������һ�������� 7��
 * 
 * @author 89591
 *
 */
public class LeetCode263 {
	
	public boolean isUgly(int num) {
		for(int i=2;i<6 && num>0;i++){
			while(num%i==0) num /= i;
		}
		return num==0;
	}
}
