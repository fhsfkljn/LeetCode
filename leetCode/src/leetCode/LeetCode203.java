package leetCode;

//203. Remove Linked List Elements
/**
 * ɾ�������е��ڸ���ֵ val ������Ԫ�ء�
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
