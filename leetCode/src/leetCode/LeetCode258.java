package leetCode;

//258. Add Digits
/**
 * ��һ���Ǹ����� num������������е����֣�ֱ�����ֻ��һ�����֡�
 * 
 * ����:
 * 
 * �趨 num = 38�����̾��� 3 + 8 = 11, 1 + 1 = 2�� ���� 2 ֻ��1�����֣����Է�������
 * 
 * @author 89591
 *
 */
public class LeetCode258 {
	
	public int addDigits(int num) {
		return 1 + (num - 1) % 9;
	}
}
