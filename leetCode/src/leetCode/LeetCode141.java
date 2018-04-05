package leetCode;

//141. Linked List Cycle
/**
 * 给定一个链表，判断链表中否有环。
 * @author 89591
 *
 */
public class LeetCode141 {
	
	public boolean hasCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while(fast!=null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast==slow) return true;
		}
		return false;
	}
}
