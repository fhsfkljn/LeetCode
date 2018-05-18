package leetCode;

//1. Two Sum
/**
 * ����һ�����������һ��Ŀ��ֵ���ҳ������к�ΪĿ��ֵ����������
 * 
 * ����Լ���ÿ������ֻ��Ӧһ�ִ𰸣���ͬ����Ԫ�ز��ܱ��ظ����á�
 * 
 * @author 89591
 *
 */
public class LeetCode1 {
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] a = new int[2];
        for(int i=0; i<nums.length; i++){
            if(!hm.containsKey(target-nums[i])){
                hm.put(nums[i], i);
            } else {
                a[1] = i;
                a[0] = hm.get(target-nums[i]);
                break;
            }
        }
        
        return a;
	}
}
