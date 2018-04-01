package leetCode;

//108. Convert Sorted Array to Binary Search Tree
/**
 * ��һ�������������е��������飬ת��Ϊһ�ø߶�ƽ�������������
 * 
 * �����У�һ���߶�ƽ���������ָһ��������ÿ���ڵ���������������ĸ߶Ȳ�ľ���ֵ������1��
 * 
 * @author 89591
 *
 */
public class LeetCode108 {

	public TreeNode sortedArrayToBST(int[] num) {
		if(num==null || num.length==0) return null;
		TreeNode node = helper(num, 0, num.length-1);
		return node;
	}

	public TreeNode helper(int[] num, int low, int high) {
		if(low>high) return null;
		int mid = low + (high-low)/2;
		TreeNode node = new TreeNode(num[mid]);
		node.left = helper(num, low, mid-1);
		node.right = helper(num, mid+1, high);
		return node;
	}

}
