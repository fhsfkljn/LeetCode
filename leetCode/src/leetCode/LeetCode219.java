package leetCode;

import java.util.HashSet;
import java.util.Set;

//219. Contains Duplicate II
/**
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使 nums [i] = nums [j]，并且 i 和 j
 * 的绝对差值最大为 k。
 * 
 * @author 89591
 *
 */
public class LeetCode219 {
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
	}
}
