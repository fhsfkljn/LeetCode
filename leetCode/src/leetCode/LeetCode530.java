package leetCode;

//530. Minimum Absolute Difference in BST
/**
 * 给定一个所有节点为非负值的二叉搜索树，求树中任意两节点的差的绝对值的最小值。
 * 
 * @author 89591
 *
 */
public class LeetCode530 {
	
	private TreeNode pre;
	private int minDiff = Integer.MAX_VALUE;
	
	public int getMinimumDifference(TreeNode root) {
		inorder(root);
        return minDiff;
	}

	private void inorder(TreeNode root) {
		if(root==null) return;
		inorder(root.left);
		if(pre!=null) minDiff = Math.min(minDiff, root.val-pre.val);
		pre = root;
		inorder(root.right);
	}
}
