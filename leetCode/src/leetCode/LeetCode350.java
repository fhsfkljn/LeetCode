package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//350. Intersection of Two Arrays II
/**
 * 给定两个数组，写一个方法来计算它们的交集。
 * 
 * 例如: 给定 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].
 * 
 * @author 89591
 *
 */
public class LeetCode350 {
	
	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		List<Integer> list = new ArrayList<>();
		int i = 0,j = 0;
		while(i<nums1.length && j<nums2.length){
			if(nums1[i]<nums2[j]) i++;
			else if(nums1[i]==nums2[j]){
				list.add(nums1[i]);
				i++;
				j++;
			}
			else j++;
		}
		int[] res = new int[list.size()];
		i = 0;
		for (Integer n : list) {
			res[i++] = n;
		}
		return res;
	}
}
