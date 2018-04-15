package leetCode;

import java.util.ArrayList;
import java.util.List;

//257. Binary Tree Paths
/**
 * 给定一个二叉树，返回从根节点到叶节点的所有路径。
 * 
 * @author 89591
 *
 */
public class LeetCode257 {
	public List<String> binaryTreePaths(TreeNode root) {
	    List<String> res = new ArrayList<>();
	    if(root!=null) searchBT(root,"",res);
	    return res;
	}

	private void searchBT(TreeNode root, String path, List<String> res) {
		if(root.left==null && root.right==null) res.add(path+root.val);
		if(root.left!=null) searchBT(root.left, path + root.val + "->", res);
		if(root.right!=null) searchBT(root.right, path + root.val + "->", res);
 	}
	
}
