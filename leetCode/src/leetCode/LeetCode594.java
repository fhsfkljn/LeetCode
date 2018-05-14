package leetCode;

import java.util.Map;
import java.util.TreeMap;

//594. Longest Harmonious Subsequence
/**
 * ��г������ָһ��������Ԫ�ص����ֵ����Сֵ֮��Ĳ��������1��
 * 
 * ���ڣ�����һ���������飬����Ҫ�����п��ܵ����������ҵ���ĺ�г�����еĳ��ȡ�
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
