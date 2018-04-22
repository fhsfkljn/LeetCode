package leetCode;

//414. Third Maximum Number
/**
 * ����һ���ǿ����飬���ش������е������������������ڣ��򷵻���������������Ҫ���㷨ʱ�临�Ӷȱ�����O(n)��
 * 
 * @author 89591
 *
 */
public class LeetCode414 {
	
	public static int thirdMax(int[] nums) {
		Integer first = null,second = null,third = null;
		for(Integer n : nums){
			if(n.equals(first) || n.equals(second) || n.equals(third)) continue;
			else if(first==null || n>first){
				third = second;
				second = first;
				first = n;
			}
			else if(second == null || n>second){
				third = second;
				second = n;
			}
			else if(third==null || n>third){ 
				third = n;
			}
			else continue;
		}
		if(first==null || second == null || third == null) return first;
		else return third;
	}
	
	public static void main(String[] args) {
		System.out.println(thirdMax(new int[]{1, 2,-2147483648}));
	}
}
