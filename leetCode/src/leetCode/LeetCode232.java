package leetCode;

import java.util.Stack;

//232. Implement Queue using Stacks
/**
 * 使用栈实现队列的下列操作：
 * 
 * push(x) -- 将一个元素放入队列的尾部。 pop() -- 从队列首部移除元素。 peek() -- 返回队列首部的元素。 empty()
 * --返回队列是否为空。
 * 
 * @author 89591
 *
 */
public class LeetCode232 {
	
	Stack<Integer> input = new Stack();
    Stack<Integer> output = new Stack();

	/** Push element x to the back of queue. */
	public void push(int x) {
		input.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		peek();
		return output.pop();
	}

	/** Get the front element. */
	public int peek() {
		if(output.isEmpty()){
			while(!input.isEmpty()){
				output.push(input.pop());
			}
		}
		return output.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return input.isEmpty() && output.isEmpty();
	}
}
