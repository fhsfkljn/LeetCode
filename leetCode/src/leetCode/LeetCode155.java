package leetCode;

import java.util.Stack;

//155. Min Stack
/**
 * ���һ��֧�� push��pop��top �����������ڳ���ʱ���ڼ�����СԪ�ص�ջ��
 * 
 * push(x) -- ��Ԫ��x����ջ�С�
 *  pop() -- ɾ��ջ����Ԫ�ء� 
 *  top() -- ��ȡջ��Ԫ�ء�
 *  getMin() --����ջ�е���СԪ�ء�
 * 
 * @author 89591
 *
 */

class MinStack {

	long min;
    Stack<Long> stack;

    public MinStack(){
        stack=new Stack<>();
    }
    
    public void push(int x) {
        if (stack.isEmpty()){
            stack.push(0L);
            min=x;
        }else{
            stack.push(x-min);//Could be negative if min value needs to change
            if (x<min) min=x;
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        
        long pop=stack.pop();
        
        if (pop<0)  min=min-pop;//If negative, increase the min value
        
    }

    public int top() {
        long top=stack.peek();
        if (top>0){
            return (int)(top+min);
        }else{
           return (int)(min);
        }
    }

    public int getMin() {
        return (int)min;
    }
}

public class LeetCode155 {

}
