package leetCode;

//563. Binary Tree Tilt
/**
 * ����һ�����������������������¶ȡ�
 * 
 * һ�����Ľڵ���¶ȶ��弴Ϊ���ýڵ��������Ľ��֮�ͺ����������֮�͵Ĳ�ľ���ֵ���ս��ĵ��¶���0��
 * 
 * ���������¶Ⱦ��������нڵ���¶�֮�͡�
 * 
 * @author 89591
 *
 */
public class LeetCode563 {

	private int sum = 0;

	public int findTilt(TreeNode root) {
		if (root == null)
			return 0;
		findTiltUtil(root);
		return sum;
	}

	private int findTiltUtil(TreeNode root) {
		if(root==null) return 0;
		int left = findTiltUtil(root.left);
		int right = findTiltUtil(root.right);
		sum += Math.abs(left-right);
		return left + right + root.val;
	}
}
