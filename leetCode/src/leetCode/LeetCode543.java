package leetCode;

import java.awt.Robot;

//543. Diameter of Binary Tree
/**
 * ����һ�ö�����������Ҫ��������ֱ�����ȡ�һ�ö�������ֱ�������������������·�������е����ֵ������·�����ܴ�������㡣
 * 
 * @author 89591
 *
 */
public class LeetCode543 {

	public int diameterOfBinaryTree(TreeNode root) {

		int[] dia = new int[] { 0 };
		diameterOfBinaryTree(root, dia);
		return dia[0];
	}

	public int diameterOfBinaryTree(TreeNode root, int[] dia) {

		if (null == root) {
			return 0;
		}

		int left = diameterOfBinaryTree(root.left, dia);
		int right = diameterOfBinaryTree(root.right, dia);

		dia[0] = Math.max(dia[0], left + right);

		return (left > right ? left : right) + 1;
	}

}
