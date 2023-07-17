// Link to the problem is https://leetcode.com/problems/evaluate-reverse-polish-notation/
// we use stack to solve the problem
// iterate through String[] tokens. if it integer the store it in the stack
// if it is operator (+,-,*,/) then pop two integers from stack and apply the operation to get the result
// then result is stored in the stack
// Time complexity is O(n) where n is size of array "tokens"
package Stack;

import java.nio.charset.Charset;
import java.util.Stack;

public class Reverse_Polish_Notation {
	 public static int evalRPN(String[] tokens) {
		Stack<Integer> stak = new Stack<>();
		for(String val : tokens) {
			if(val.equals("+")) {
				int a = stak.pop();
				int b = stak.pop();
				stak.push(b+a);
			}
			else if(val.equals("-")) {
				int a = stak.pop();
				int b = stak.pop();
				stak.push(b-a);
			}
			else if(val.equals("*")) {
				int a = stak.pop();
				int b = stak.pop();
				stak.push(b*a);
			}
			else if(val.equals("/")) {
				int a = stak.pop();
				int b = stak.pop();
				stak.push(b/a);
			}
			else {
				stak.push(Integer.valueOf(val));
			}
		}
		return stak.pop();
	        
	    }
	public static void main(String[] args) {
		String [] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
	}

}
