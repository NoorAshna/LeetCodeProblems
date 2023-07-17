// link to the problem is https://leetcode.com/problems/valid-parentheses/
package Stack;

import java.util.Stack;

public class Valid_Parentheses {
	 public static boolean isValid(String s) {
	        Stack<Character> stak =new Stack<>();
	        for(int i = 0 ; i < s.length() ; i++) {
	        	char ch = s.charAt(i);
	        	// add to the stack if it is opening bracket
	        	if(ch == '(' || ch == '[' || ch == '{' ) {
	        		stak.push(ch);
	        	}
	        	// if it is closing bracket do the following operations
	        	else {
	        		// false if stack is empty. means no opening bracket found for closing bracket
	        		if(stak.isEmpty()) {
	        			return false;
	        		}
	        		// remove from stack the opening bracket for the corresponding closing bracket
	        		else if(ch == ')' && stak.peek() == '(' ||
	        				ch == ']' && stak.peek() == '[' ||
	        				ch == '}' && stak.peek() == '{') {
	        			stak.pop();
	        		}
	        		// if the same opening bracket not found for the closing bracket return false
	        		else {
	        			return false;
	        		}
	        	}
}
	        // at the end if stack is empty it will return true else it will return false
			return stak.isEmpty();
	    }
	public static void main(String[] args) {
		String s = "{[]}()";
		System.out.println(isValid(s));

	}

}
