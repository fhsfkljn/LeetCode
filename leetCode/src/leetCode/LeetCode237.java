package leetCode;

//237. Delete Node in a Linked List
/**
 * ���дһ��������ʹ�����ɾ��ĳ�������и����ģ���ĩβ�ģ��ڵ㣬����ֻ������Ҫ��ɾ���Ľڵ㡣
 * 
 * @author 89591
 *
 */
public class LeetCode237 {
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
