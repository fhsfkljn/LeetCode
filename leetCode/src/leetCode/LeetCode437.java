package leetCode;

//437. Path Sum III
/**
 * 给定一个二叉树，二叉树的每个节点含有一个整数。
 * 
 * 找出路径和等于给定数的路径总数。
 * 
 * 路径不需要从根节点开始，也不需要在叶节点结束，当路径方向必须是向下的（只从父节点到子节点）。
 * 
 * 二叉树不超过1000个节点，节点的整数值的范围是[-1000000,1000000]。
 * 
 * @author 89591
 *
 */
public class LeetCode437 {
	
	public int pathSum(TreeNode root, int sum) {
		if(root==null) return 0;
		return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
	}
	
	private int pathSumFrom(TreeNode node, int sum) {
		if(node==null) return 0;
		return ((sum-node.val==0) ? 1 : 0) +pathSumFrom(node.left, sum-node.val) + pathSumFrom(node.right, sum-node.val);
	}
}
