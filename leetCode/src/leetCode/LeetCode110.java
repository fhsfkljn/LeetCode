package leetCode;

//110. Balanced Binary Tree
public class LeetCode110 {

	
	private static final int UNBLANACE = -99;
	
	public boolean isBalanced(TreeNode root){
		if(root==null) return true;
		return getHeight(root) != UNBLANACE;
	}

	private int getHeight(TreeNode root) {
		if(root==null) return -1;
		int l = getHeight(root.left);
		int r = getHeight(root.right);
		if(l==UNBLANACE ||r==UNBLANACE || Math.abs(l-r)>1) return UNBLANACE;
		return 1+Math.max(l, r);
	}
}
