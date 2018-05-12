package leetCode;

//563. Binary Tree Tilt
/**
 * 给定一个二叉树，计算整个树的坡度。
 * 
 * 一个树的节点的坡度定义即为，该节点左子树的结点之和和右子树结点之和的差的绝对值。空结点的的坡度是0。
 * 
 * 整个树的坡度就是其所有节点的坡度之和。
 * 
 * @author 89591
 *
 */
public class LeetCode563 {

	private int sum = 0;

	public int findTilt(TreeNode root) {
		if (root == null)
			return 0;
		findTiltUtil(root);
		return sum;
	}

	private int findTiltUtil(TreeNode root) {
		if(root==null) return 0;
		int left = findTiltUtil(root.left);
		int right = findTiltUtil(root.right);
		sum += Math.abs(left-right);
		return left + right + root.val;
	}
}
