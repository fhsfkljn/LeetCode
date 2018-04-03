package leetCode;

//121. Best Time to Buy and Sell Stock
/**
 * ��������һ�����飬���е� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�
 * 
 * �����ֻ��������һ�ʽ��ף������������һ�ɹ�Ʊ���������һ���㷨���ҵ���������
 * 
 * @author 89591
 *
 */
public class LeetCode121 {
	
	public int maxProfit(int[] prices) {
		int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
	}
}
