package leetCode;

import java.util.HashSet;
import java.util.Set;

//349. Intersection of Two Arrays
/**
 * 给定两个数组，写一个函数来计算它们的交集。
 * 
 * 例子:
 * 
 * 给定 num1= [1, 2, 2, 1], nums2 = [2, 2], 返回 [2].
 * 
 * @author 89591
 *
 */
public class LeetCode349 {
	
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for(int i=0;i<nums1.length;i++) set1.add(nums1[i]);
		for(int i=0;i<nums2.length;i++){
			if(set1.contains(nums2[i])) set2.add(nums2[i]);
		}
		int[] res = new int[set2.size()];
		int i = 0;
		for (Integer n : set2) {
			res[i++] = n;
		}
		return res;
	}
}
