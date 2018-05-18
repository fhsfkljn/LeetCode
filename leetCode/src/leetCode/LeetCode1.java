package leetCode;

//1. Two Sum
/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * 
 * @author 89591
 *
 */
public class LeetCode1 {
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] a = new int[2];
        for(int i=0; i<nums.length; i++){
            if(!hm.containsKey(target-nums[i])){
                hm.put(nums[i], i);
            } else {
                a[1] = i;
                a[0] = hm.get(target-nums[i]);
                break;
            }
        }
        
        return a;
	}
}
