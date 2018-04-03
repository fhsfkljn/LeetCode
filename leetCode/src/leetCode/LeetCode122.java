package leetCode;

//122. Best Time to Buy and Sell Stock II
/**
 * ������һ�����飬���ĵ� i ��Ԫ����һ�������Ĺ�Ʊ�ڵ� i ��ļ۸�
 * ���һ���㷨���ҵ����������������ɾ����ܶ�Ľ��ף����������Ʊ����Ȼ�����㲻��ͬʱ���������ף���������ٴι���ǰ���۹�Ʊ����
 * 
 * @author 89591
 *
 */
public class LeetCode122 {
	
	public int maxProfit(int[] prices) {
		int max = 0,temp = 0;
		for(int i=1;i<prices.length;i++){
			temp = Math.max(0, prices[i]-prices[i-1]);
			max += temp;
		}
		return max;
	}
}
