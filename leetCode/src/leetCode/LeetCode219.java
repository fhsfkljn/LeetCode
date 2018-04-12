package leetCode;

import java.util.HashSet;
import java.util.Set;

//219. Contains Duplicate II
/**
 * ����һ�����������һ������ k���ж��������Ƿ����������ͬ������ i �� j��ʹ nums [i] = nums [j]������ i �� j
 * �ľ��Բ�ֵ���Ϊ k��
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
