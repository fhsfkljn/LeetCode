package leetCode;

//122. Best Time to Buy and Sell Stock II
/**
 * 假设有一个数组，它的第 i 个元素是一个给定的股票在第 i 天的价格。
 * 设计一个算法来找到最大的利润。你可以完成尽可能多的交易（多次买卖股票）。然而，你不能同时参与多个交易（你必须在再次购买前出售股票）。
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
