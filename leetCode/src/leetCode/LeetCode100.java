package leetCode;

/**
 * 100. Same Tree ����������������дһ����������������Ƿ���ͬ��
 * 
 * ����������ڽṹ����ͬ���ҽڵ������ͬ��ֵ������Ϊ��������ͬ�ġ�
 * 
 * @author 89591
 *
 */
public class LeetCode100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		 if(p == null && q == null) return true;
		    if(p == null || q == null) return false;
		    if(p.val == q.val)
		        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		    return false;
	}
}
