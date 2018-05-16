package leetCode;

//606. Construct String from Binary Tree
/**
 * 你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
 * 
 * 空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
 * 
 * @author 89591
 *
 */
public class LeetCode606 {

	public String tree2str(TreeNode t) {
		if (t == null)
			return "";
		String l = tree2str(t.left);
		String r = tree2str(t.right);
		if (l.equals("") && r.equals(""))
			return t.val + "";
		else if (r.equals(""))
			return t.val + "(" + l + ")";
		return t.val + "(" + l + ")" + "(" + r + ")";
	}
}
