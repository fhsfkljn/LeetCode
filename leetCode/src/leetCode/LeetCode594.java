package leetCode;

import java.util.Map;
import java.util.TreeMap;

//594. Longest Harmonious Subsequence
/**
 * 和谐数组是指一个数组里元素的最大值和最小值之间的差别正好是1。
 * 
 * 现在，给定一个整数数组，你需要在所有可能的子序列中找到最长的和谐子序列的长度。
 * 
 * @author 89591
 *
 */
public class LeetCode594 {
	
	public static int findLHS(int[] nums) {
		if(nums==null || nums.length==0) return 0;
		TreeMap<Integer, Integer> record = new TreeMap<>();
		for (int i : nums) {
			record.put(i, record.getOrDefault(i, 0)+1);
		}
		int preKey = record.firstKey(),preValue = record.get(preKey);
		int max = 0;
		for(Map.Entry<Integer, Integer> entry : record.entrySet()){
			if(entry.getKey()-preKey==1){
				max = Math.max(max, preValue + entry.getValue());
			}
			preKey = entry.getKey();
			preValue = entry.getValue();
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(findLHS(new int[]{1,1,1,1}));
	}
}
