package leetCode;

//404. Sum of Left Leaves
/**
 * ���������������������Ҷ��֮�͡�
 * 
 * @author 89591
 *
 */
public class LeetCode404 {
	
	public int sumOfLeftLeaves(TreeNode root) {
		if(root==null) return 0;
		int res = 0;
		if(root.left!=null){
			if(root.left.left==null && root.left.right==null) res += root.left.val;
			else res += sumOfLeftLeaves(root.left);
		}
		res += sumOfLeftLeaves(root.right);
		return res;
	}
}
