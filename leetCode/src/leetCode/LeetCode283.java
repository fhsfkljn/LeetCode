package leetCode;

//283. Move Zeroes
/**
 * ����һ������ nums, ��дһ������������ 0 �ƶ�������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
 * 
 * ���磬 ���� nums = [0, 1, 0, 3, 12]�����ú���֮�� nums ӦΪ [1, 3, 12, 0, 0]��
 * 
 * @author 89591
 *
 */
public class LeetCode283 {
	
	public static void moveZeroes(int[] nums) {
		int p = 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=0){
				nums[p] = nums[i];
				p++;
			}
		}
		for(int i=p;i<nums.length;i++){
			nums[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		moveZeroes(new int[]{0,1,0,3,12});
	}
}
