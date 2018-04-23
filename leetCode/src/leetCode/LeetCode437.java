package leetCode;

//437. Path Sum III
/**
 * ����һ������������������ÿ���ڵ㺬��һ��������
 * 
 * �ҳ�·���͵��ڸ�������·��������
 * 
 * ·������Ҫ�Ӹ��ڵ㿪ʼ��Ҳ����Ҫ��Ҷ�ڵ��������·��������������µģ�ֻ�Ӹ��ڵ㵽�ӽڵ㣩��
 * 
 * ������������1000���ڵ㣬�ڵ������ֵ�ķ�Χ��[-1000000,1000000]��
 * 
 * @author 89591
 *
 */
public class LeetCode437 {
	
	public int pathSum(TreeNode root, int sum) {
		if(root==null) return 0;
		return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
	}
	
	private int pathSumFrom(TreeNode node, int sum) {
		if(node==null) return 0;
		return ((sum-node.val==0) ? 1 : 0) +pathSumFrom(node.left, sum-node.val) + pathSumFrom(node.right, sum-node.val);
	}
}
