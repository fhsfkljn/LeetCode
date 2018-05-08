package leetCode;

//530. Minimum Absolute Difference in BST
/**
 * ����һ�����нڵ�Ϊ�Ǹ�ֵ�Ķ������������������������ڵ�Ĳ�ľ���ֵ����Сֵ��
 * 
 * @author 89591
 *
 */
public class LeetCode530 {
	
	private TreeNode pre;
	private int minDiff = Integer.MAX_VALUE;
	
	public int getMinimumDifference(TreeNode root) {
		inorder(root);
        return minDiff;
	}

	private void inorder(TreeNode root) {
		if(root==null) return;
		inorder(root.left);
		if(pre!=null) minDiff = Math.min(minDiff, root.val-pre.val);
		pre = root;
		inorder(root.right);
	}
}
