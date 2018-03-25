package leetCode;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

// 104. Maximum Depth of Binary Tree
// ���α������ɣ�ע����Ҫ����һ��booleanֵ����֤ÿ��ֻ��һ��
public class leetCode104 {
	int count = 0;

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int max = 1;

		moreDeeper(root, max);
		return count;
	}

	private void moreDeeper(TreeNode root, int max) {

		boolean flag = true;

		if (root.left != null) {
			if (flag) {
				max++;
				flag = false;
			}
			moreDeeper(root.left, max);
		}

		if (root.right != null) {
			if (flag) {
				max++;
				flag = false;
			}
			moreDeeper(root.right, max);
		}

		count = Math.max(count, max);

	}
}
