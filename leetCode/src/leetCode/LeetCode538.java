package leetCode;

//538. Convert BST to Greater Tree
/**
 * ����һ��������������Binary Search Tree��������ת����Ϊ�ۼ�����Greater
 * Tree)��ʹ��ÿ���ڵ��ֵ��ԭ���Ľڵ�ֵ�������д������Ľڵ�ֵ֮�͡�
 * 
 * @author 89591
 *
 */
public class LeetCode538 {
	
	int sum = 0;
	
	public TreeNode convertBST(TreeNode root) {
		addNode(root);
		return root;
	}

	private void addNode(TreeNode root) {
		if(root==null) return;
		addNode(root.right);
		root.val += sum;
		sum = root.val;
		addNode(root.left);
		
	}
}
