package leetCode;

//27. Remove Element
//由于此题说明了之后的数组可以无序，那么每次比较如果当前的值等于val，将数组最后一个数付给当前值，这样只需要n/2次即可
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
