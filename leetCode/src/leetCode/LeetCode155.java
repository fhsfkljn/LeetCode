package leetCode;

import java.util.Stack;

//155. Min Stack
/**
 * 设计一个支持 push，pop，top 操作，并能在常量时间内检索最小元素的栈。
 * 
 * push(x) -- 将元素x推入栈中。
 *  pop() -- 删除栈顶的元素。 
 *  top() -- 获取栈顶元素。
 *  getMin() --检索栈中的最小元素。
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
