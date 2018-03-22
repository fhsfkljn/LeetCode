package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class LeetCode637 {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> result = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();

		if (root == null)
			return result;
		q.add(root);
		while (!q.isEmpty()) {
			int n = q.size();
			double sum = 0.0;
			for (int i = 0; i < n; i++) {
				TreeNode node = q.poll();
				sum += node.val;
				if (node.left != null)
					q.offer(node.left);
				if (node.right != null)
					q.offer(node.right);
			}
			result.add(sum / n);
		}
		return result;
	}
}
