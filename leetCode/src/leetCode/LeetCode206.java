package leetCode;

//206. Reverse Linked List
/**
 * ��תһ��������
 * 
 * @author 89591
 *
 */
public class LeetCode206 {
	
	public ListNode reverseList(ListNode head) {
		ListNode newHead = null;
		while(head!=null){
			ListNode next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		return newHead;
	}
}
