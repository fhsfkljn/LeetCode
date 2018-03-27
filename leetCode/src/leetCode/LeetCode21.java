package leetCode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

// 21. Merge Two Sorted Lists
//�����ţ�����ϵĽ�ָofferһ����ʹ�õݹ飬ÿ�η���ָ�����һ������
public class LeetCode21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null) return l2;
		if(l2==null) return l1;
		
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		}else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}
}
