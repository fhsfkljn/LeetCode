package leetCode;

//167. Two Sum II - Input array is sorted
/**
 * ����һ���Ѱ����������� ���������飬�ҵ�������ʹ���������֮�͵���Ŀ������
 * 
 * @author 89591
 *
 */
public class LeetCode167 {
	public int[] twoSum(int[] numbers, int target) {
		int l = 0,r = numbers.length-1;
		while(numbers[l]+numbers[r]!=target){
			if(numbers[l]+numbers[r]>target) r--;
			else l++;
		}
		return new int[]{l+1,r+1};
	}
}
