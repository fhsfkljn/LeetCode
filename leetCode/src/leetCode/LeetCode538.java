package leetCode;

//538. Convert BST to Greater Tree
/**
 * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater
 * Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
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
