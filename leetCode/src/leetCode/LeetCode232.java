package leetCode;

import java.util.Stack;

//232. Implement Queue using Stacks
/**
 * ʹ��ջʵ�ֶ��е����в�����
 * 
 * push(x) -- ��һ��Ԫ�ط�����е�β���� pop() -- �Ӷ����ײ��Ƴ�Ԫ�ء� peek() -- ���ض����ײ���Ԫ�ء� empty()
 * --���ض����Ƿ�Ϊ�ա�
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
