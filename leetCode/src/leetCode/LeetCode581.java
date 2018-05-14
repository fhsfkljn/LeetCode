package leetCode;

import java.util.Arrays;

//581. Shortest Unsorted Continuous Subarray
/**
 * ����һ���������飬����ҪѰ��һ�������������飬���������������������������ô�������鶼���Ϊ��������
 * 
 * ���ҵ���������Ӧ����̵ģ���������ĳ��ȡ�
 * 
 * @author 89591
 *
 */
public class LeetCode581 {
	
	public int findUnsortedSubarray(int[] nums) {
		if(nums==null || nums.length==0) return 0;
		int[] pre = nums.clone();
		Arrays.sort(nums);
		
		int head = -1,tail = -1;
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=pre[i]){
				if(head==-1) head = i;
				tail = i;
			}
		}
		return head==-1 ? 0 : tail-head+1;
	}
}
