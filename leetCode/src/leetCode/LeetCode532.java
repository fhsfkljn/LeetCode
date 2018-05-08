package leetCode;

import java.util.HashMap;
import java.util.Map;

//532. K-diff Pairs in an Array
/**
 * 给定一个整数数组和一个整数 k, 你需要在数组里找到不同的 k-diff 数对。这里将 k-diff 数对定义为一个整数对 (i, j), 其中 i 和
 * j 都是数组中的数字，且两数之差的绝对值是 k.
 * 
 * @author 89591
 *
 */
public class LeetCode532 {
	
	public int findPairs(int[] nums, int k) {
		if(nums==null || nums.length==0 || k<0) return 0;
		Map<Integer, Integer> record = new HashMap<>();
		int count = 0;
		for(int n : nums){
			record.put(n, record.getOrDefault(n, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry : record.entrySet()){
			if(k==0){
				if(entry.getValue() > 1) count++;
			}else{
				if(record.containsKey(entry.getKey()+k)) count++;
			}
		}
		return count;
	}
}
