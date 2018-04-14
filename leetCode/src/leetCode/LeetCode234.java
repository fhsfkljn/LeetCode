package leetCode;

//234. Palindrome Linked List
/**
 * 请检查一个链表是否为回文链表。
 * 
 * @author 89591
 *
 */
public class LeetCode234 {
	
	ListNode h = null;
	
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        if(h==null) h = head;
        boolean temp = true;
        if(head.next!=null) temp &= isPalindrome(head.next);
        temp &= (h.val==head.val);
        h = h.next;
        return temp;
    }
}
