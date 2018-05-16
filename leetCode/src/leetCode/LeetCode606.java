package leetCode;

//606. Construct String from Binary Tree
/**
 * ����Ҫ����ǰ������ķ�ʽ����һ��������ת����һ�������ź�������ɵ��ַ�����
 * 
 * �սڵ�����һ�Կ����� "()" ��ʾ����������Ҫʡ�����в�Ӱ���ַ�����ԭʼ������֮���һ��һӳ���ϵ�Ŀ����Ŷԡ�
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
