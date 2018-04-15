package leetCode;

//237. Delete Node in a Linked List
/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾的）节点，您将只被给予要求被删除的节点。
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
