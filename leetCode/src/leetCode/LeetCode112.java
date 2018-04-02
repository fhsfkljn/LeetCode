package leetCode;

//112. Path Sum
//给定一棵二叉树和一个总和，确定该树中是否存在根到叶的路径，这条路径的所有值相加等于给定的总和。
public class LeetCode112 {

	public boolean hasPathSum(TreeNode root, int sum) {
		if(root==null) return false;
		if(root.left==null && root.right==null && root.val==sum) return true;
		return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
	}
}
