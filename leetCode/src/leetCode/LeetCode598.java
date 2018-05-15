package leetCode;

//598. Range Addition II
/**
 * ����һ����ʼԪ��ȫ��Ϊ 0����СΪ m*n �ľ��� M �Լ��� M �ϵ�һϵ�и��²�����
 * 
 * �����ö�ά�����ʾ�����е�ÿ��������һ���������������� a �� b �������ʾ�������ǽ����з��� 0 <= i < a �Լ� 0 <= j < b ��Ԫ��
 * M[i][j] ��ֵ������ 1��
 * 
 * ��ִ�и�����һϵ�в���������Ҫ���ؾ����к������������Ԫ�ظ�����
 * 
 * @author 89591
 *
 */
public class LeetCode598 {

	public int maxCount(int m, int n, int[][] ops) {
		int borderX = m, borderY = n;
		for (int[] op : ops) {
			borderX = Math.min(borderX, op[0]);
			borderY = Math.min(borderY, op[1]);
		}
		return borderX * borderY;
	}
}
