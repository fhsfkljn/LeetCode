package leetCode;

//572. Subtree of Another Tree
/**
 * ���������ǿն����� s �� t������ s ���Ƿ������ t ������ͬ�ṹ�ͽڵ�ֵ��������s ��һ���������� s ��һ���ڵ������ڵ���������s
 * Ҳ���Կ����������һ��������
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
