package leetCode;

//507. Perfect Number
/**
 * ����һ�� ��������������ͳ������������������������֮����ȣ����ǳ���Ϊ������������
 * 
 * ����һ�� ������ n�� ������������������� True�����򷵻� False
 * 
 * @author 89591
 *
 */
public class LeetCode507 {
	
	public boolean checkPerfectNumber(int num) {
		//{6, 28, 496, 8128, 33550336};
		if(num==6 || num==28 || num==496 || num==8128 || num==33550336) return true;
		else return false;
	}
}
