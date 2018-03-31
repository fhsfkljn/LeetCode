package leetCode;

/**
 * 100. Same Tree 给定两个二叉树，写一个函数来检查它们是否相同。
 * 
 * 如果两棵树在结构上相同并且节点具有相同的值，则认为它们是相同的。
 * 
 * @author 89591
 *
 */
public class LeetCode100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		 if(p == null && q == null) return true;
		    if(p == null || q == null) return false;
		    if(p.val == q.val)
		        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		    return false;
	}
}
