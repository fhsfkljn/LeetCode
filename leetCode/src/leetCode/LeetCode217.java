package leetCode;

import java.util.HashMap;
import java.util.Map;

//217. Contains Duplicate
/**
 * 给定一个整数数组，判断是否存在重复元素。
 * 
 * 如果任何值在数组中出现至少两次，函数应该返回 true。如果每个元素都不相同，则返回 false。
 * 
 * @author 89591
 *
 */
public class LeetCode217 {
	
	public boolean containsDuplicate(int[] nums) {
		if(nums == null || nums.length==0) return false;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])) return true;
			map.put(nums[i], i);
		}
		return false;
	}
}
