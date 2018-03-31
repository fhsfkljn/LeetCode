package leetCode;

/**
 * 101. Symmetric Tree 给定一个二叉树，检查它是否是它自己的镜像（即，围绕它的中心对称）。
 * 
 * @author 89591
 *
 */
public class LeetCode101 {
	public boolean isSymmetric(TreeNode root) {
		return root == null || isSymmetric(root.left,root.right);
	}

	private boolean isSymmetric(TreeNode left, TreeNode right) {
		if(left==null && right==null) return true;
		if(left==null || right==null) return false;
		if(left.val == right.val) return isSymmetric(left.left,right.right) && isSymmetric(left.right, right.left);
		return false;
	}
}
