package leetCode;

//235. Lowest Common Ancestor of a Binary Search Tree
/**
 * 给定一棵二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * 
 * @author 89591
 *
 */
public class LeetCode235 {
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		while((root.val-p.val)*(root.val-q.val)>0){
			root = p.val < root.val ? root.left : root.right;
		}
		return root;
	}
}
