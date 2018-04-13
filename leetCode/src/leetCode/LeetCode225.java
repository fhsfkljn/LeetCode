package leetCode;

import java.util.LinkedList;
import java.util.Queue;

//225. Implement Stack using Queues
/**
 * ʹ�ö���ʵ��ջ�����в�����
 * 
 * push(x) --Ԫ�� x ��ջ pop() -- �Ƴ�ջ��Ԫ�� top() -- ��ȡջ��Ԫ�� empty() --����ջ�Ƿ�Ϊ��
 * 
 * @author 89591
 *
 */
public class LeetCode225 {
	private Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
       queue.add(x);
       for(int i=1;i<queue.size();i++){
    	  queue.add(queue.remove());
       }
    }

    public void pop() {
        queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
