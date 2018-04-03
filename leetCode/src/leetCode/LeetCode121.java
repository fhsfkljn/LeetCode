package leetCode;

//121. Best Time to Buy and Sell Stock
/**
 * 假设你有一个数组，其中第 i 个元素是一支给定股票第 i 天的价格。
 * 
 * 如果您只能完成最多一笔交易（即买入和卖出一股股票），则设计一个算法来找到最大的利润。
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
