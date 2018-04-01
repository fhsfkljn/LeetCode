package leetCode;

//108. Convert Sorted Array to Binary Search Tree
/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * 
 * 此题中，一个高度平衡二叉树是指一个二叉树每个节点的左右两个子树的高度差的绝对值不超过1。
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
