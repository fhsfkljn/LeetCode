package leetCode;

import java.util.ArrayList;
import java.util.Stack;

//20. Valid Parentheses
//简单的括号匹配，用栈解决
public class LeetCode20 {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c:s.toCharArray()){
			if(c=='(') stack.push(')');
			else if(c=='[') stack.push(']');
			else if(c=='{') stack.push('}');
			else{
				if(stack.isEmpty() || stack.pop() != c){
					return false;
				}
			}
			
		}
		return stack.isEmpty();
	}
}
