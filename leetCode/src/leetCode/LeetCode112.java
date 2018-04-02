package leetCode;

//112. Path Sum
//����һ�ö�������һ���ܺͣ�ȷ���������Ƿ���ڸ���Ҷ��·��������·��������ֵ��ӵ��ڸ������ܺ͡�
public class LeetCode112 {

	public boolean hasPathSum(TreeNode root, int sum) {
		if(root==null) return false;
		if(root.left==null && root.right==null && root.val==sum) return true;
		return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
	}
}
