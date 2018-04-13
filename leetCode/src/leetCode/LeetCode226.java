package leetCode;

//226. Invert Binary Tree
/**
 * ·­×ªÒ»¿Ã¶þ²æÊ÷¡£
 * 
 * @author 89591
 *
 */
public class LeetCode226 {
	
	public TreeNode invertTree(TreeNode root) {
		if(root==null) return null;
		TreeNode left = root.left;
		TreeNode right = root.right;
		root.left = invertTree(right);
		root.right = invertTree(left);
		return root;
	}
}
