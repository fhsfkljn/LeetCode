package leetCode;

//404. Sum of Left Leaves
/**
 * 计算给定二叉树的所有左叶子之和。
 * 
 * @author 89591
 *
 */
public class LeetCode404 {
	
	public int sumOfLeftLeaves(TreeNode root) {
		if(root==null) return 0;
		int res = 0;
		if(root.left!=null){
			if(root.left.left==null && root.left.right==null) res += root.left.val;
			else res += sumOfLeftLeaves(root.left);
		}
		res += sumOfLeftLeaves(root.right);
		return res;
	}
}
