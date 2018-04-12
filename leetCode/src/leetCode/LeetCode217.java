package leetCode;

import java.util.HashMap;
import java.util.Map;

//217. Contains Duplicate
/**
 * ����һ���������飬�ж��Ƿ�����ظ�Ԫ�ء�
 * 
 * ����κ�ֵ�������г����������Σ�����Ӧ�÷��� true�����ÿ��Ԫ�ض�����ͬ���򷵻� false��
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
