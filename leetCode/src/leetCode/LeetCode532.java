package leetCode;

import java.util.HashMap;
import java.util.Map;

//532. K-diff Pairs in an Array
/**
 * ����һ�����������һ������ k, ����Ҫ���������ҵ���ͬ�� k-diff ���ԡ����ｫ k-diff ���Զ���Ϊһ�������� (i, j), ���� i ��
 * j ���������е����֣�������֮��ľ���ֵ�� k.
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
