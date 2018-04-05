package leetCode;

//160. Intersection of Two Linked Lists
/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 * @author 89591
 *
 */
public class LeetCode160 {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		//boundary check
	    if(headA == null || headB == null) return null;
	    
	    ListNode a = headA;
	    ListNode b = headB;
	    
	    //if a & b have different len, then we will stop the loop after second iteration
	    while( a != b){
	    	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
	        a = a == null? headB : a.next;
	        b = b == null? headA : b.next;    
	    }
	    
	    return a;
	}
}
