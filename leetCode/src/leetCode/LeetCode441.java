package leetCode;

//441. Arranging Coins
/**
 * ���ܹ��� n öӲ�ң�����Ҫ�����ǰڳ�һ��������״���� k �оͱ��������� k öӲ�ҡ�
 * 
 * ����һ������ n���ҳ����γ����������е���������
 * 
 * n ��һ���Ǹ�������������32λ�з������͵ķ�Χ�ڡ�
 * 
 * @author 89591
 *
 */
public class LeetCode441 {
	
	public static int arrangeCoins(int n) {
		return (int)((-1 + Math.sqrt(1 + 8 * (long)n)) / 2);
	}
	
	public static void main(String[] args) {
		System.out.println(arrangeCoins(180000));
	}
}
