package leetCode;

import java.util.ArrayList;
import java.util.List;

//501. Find Mode in Binary Search Tree
/**
 * 给定带有重复项的二叉搜索树（BST），查找给定BST中的所有模式（最常出现的元素）。
 * 
 * 假定BST定义如下：
 * 
 * 节点的左侧子树只包含密钥小于或等于节点密钥的节点。 节点的右侧子树只包含密钥大于或等于节点密钥的节点。 左边和右边的子树也必须是二叉搜索树。
 * 
 * @author 89591
 *
 */
public class LeetCode501 {
	List<Integer> ans = new ArrayList<>();
    Integer pre;
    int maxFreq = 0, curFreq = 0;
    public int[] findMode(TreeNode root) {
        traverse(root);
        int[] res = new int[ans.size()];
        for (int i = 0; i < res.length; i++) res[i] = ans.get(i);
        return res;
    }
    
    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        //inorder traversal
        traverse(root.left);
        if (pre != null && root.val == pre) {
            curFreq++;
        } else {
            curFreq = 1;
        }
        if (curFreq == maxFreq) {
            ans.add(root.val);
        } else if (curFreq > maxFreq) {
            maxFreq = curFreq;
            ans = new ArrayList<>();
            ans.add(root.val);
        } 

        pre = root.val;
        traverse(root.right);
    }
}
