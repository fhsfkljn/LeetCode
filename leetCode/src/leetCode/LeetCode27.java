package leetCode;

//27. Remove Element
//���ڴ���˵����֮����������������ôÿ�αȽ������ǰ��ֵ����val�����������һ����������ǰֵ������ֻ��Ҫn/2�μ���
public class LeetCode27 {
	public int removeElement(int[] nums, int val) {
		int length = nums.length;
		for(int i=0;i<length;i++){
			while(nums[i]==val && i<length){
				nums[i] = nums[--length];
			}
		}
		return length;
	}
}
