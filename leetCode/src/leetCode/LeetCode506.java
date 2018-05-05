package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//506. Relative Ranks
/**
 * ���� N ���˶�Ա�ĳɼ����ҳ����ǵ�������β�����ǰ������Ӧ�Ľ��ơ�ǰ�����˶�Ա���ᱻ�ֱ����� �����ơ��������ơ� �͡� ͭ�ơ���"Gold
 * Medal", "Silver Medal", "Bronze Medal"����
 * 
 * (ע������Խ�ߵ�ѡ�֣�����Խ��ǰ��)
 * 
 * @author 89591
 *
 */
public class LeetCode506 {
	
	public static String[] findRelativeRanks(int[] nums) {
		Map<Integer,Integer> record = new HashMap<>();
		String[] res = new String[nums.length];
		for(int i=0;i<nums.length;i++) record.put(nums[i], i);
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++){
			if(i==nums.length-3) res[record.get(nums[i])] = "Bronze Medal";
			else if(i==nums.length-2) res[record.get(nums[i])] = "Silver Medal";
			else if(i==nums.length-1) res[record.get(nums[i])] = "Gold Medal";
			else res[record.get(nums[i])] = nums.length-i+"";
		}
		return res;
	}
	
	public static void main(String[] args) {
		String[] res = findRelativeRanks(new int[]{10,3,8,9,4});
		for (String string : res) {
			System.out.print(string+" ");
		}
	}
}
