package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//350. Intersection of Two Arrays II
/**
 * �����������飬дһ���������������ǵĽ�����
 * 
 * ����: ���� nums1 = [1, 2, 2, 1], nums2 = [2, 2], ���� [2, 2].
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
