package leetCode;

/**
 * 101. Symmetric Tree ����һ����������������Ƿ������Լ��ľ��񣨼���Χ���������ĶԳƣ���
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
