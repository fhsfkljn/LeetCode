package leetCode;

import java.util.ArrayList;
import java.util.List;

//501. Find Mode in Binary Search Tree
/**
 * ���������ظ���Ķ�����������BST�������Ҹ���BST�е�����ģʽ������ֵ�Ԫ�أ���
 * 
 * �ٶ�BST�������£�
 * 
 * �ڵ���������ֻ������ԿС�ڻ���ڽڵ���Կ�Ľڵ㡣 �ڵ���Ҳ�����ֻ������Կ���ڻ���ڽڵ���Կ�Ľڵ㡣 ��ߺ��ұߵ�����Ҳ�����Ƕ�����������
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
