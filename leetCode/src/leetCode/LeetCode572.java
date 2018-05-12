package leetCode;

//572. Subtree of Another Tree
/**
 * 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s
 * 也可以看做它自身的一棵子树。
 * 
 * @author 89591
 *
 */
public class LeetCode572 {

	public boolean isSubtree(TreeNode s, TreeNode t) {
		if(s==null) return false;
		return isSame(s,t) || isSubtree(s.left, t) || isSubtree(s.right,t);
	}

	private boolean isSame(TreeNode s, TreeNode t) {
		if(s==null && t==null) return true;
		if(s==null || t==null) return false;
		return s.val==t.val && isSame(s.left, t.left) && isSame(s.right, t.right);
	}

	
}
