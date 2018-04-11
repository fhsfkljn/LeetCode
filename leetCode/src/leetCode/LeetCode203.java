package leetCode;

//203. Remove Linked List Elements
/**
 * 删除链表中等于给定值 val 的所有元素。
 * 
 * @author 89591
 *
 */
public class LeetCode203 {
	
	public ListNode removeElements(ListNode head, int val) {
		if(head==null) return null;
		head.next = removeElements(head.next, val);
		return head.val == val ? head.next : head;
	}
}
