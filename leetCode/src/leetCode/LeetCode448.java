package leetCode;

import java.util.ArrayList;
import java.util.List;

//448. Find All Numbers Disappeared in an Array
/**
 * ����һ����Χ�� 1 �� a[i] �� n ( n = �����С ) �� �������飬�����е�Ԫ��һЩ���������Σ���һЩֻ����һ�Ρ�
 * 
 * �ҵ������� [1, n] ��Χ֮��û�г����������е����֡�
 * 
 * �����ڲ�ʹ�ö���ռ���ʱ�临�Ӷ�ΪO(n)�������������������? ����Լٶ����ص����鲻���ڶ���ռ��ڡ�
 * 
 * @author 89591
 *
 */
public class LeetCode448 {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<>();
		for(int i=0;i<nums.length;i++){
			int temp = Math.abs(nums[i])-1;
			if(nums[temp]>0) nums[temp] = -nums[temp];
		}
		for(int i=0;i<nums.length;i++){
			if(nums[i]>0) res.add(i+1);
		}
		return res;
	}
	
	public static void main(String[] args) {
		List<Integer> res = findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
		System.out.println(res);
	}
}
