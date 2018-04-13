package leetCode;

import java.util.LinkedList;
import java.util.Queue;

//225. Implement Stack using Queues
/**
 * 使用队列实现栈的下列操作：
 * 
 * push(x) --元素 x 入栈 pop() -- 移除栈顶元素 top() -- 获取栈顶元素 empty() --返回栈是否为空
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
