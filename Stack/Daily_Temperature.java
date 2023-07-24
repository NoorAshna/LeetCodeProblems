// Link to the problem is https://leetcode.com/problems/daily-temperatures/
// we  use stacks to solve the problem
// tranverse through end of the array and store the index of array to the stack
// if the current temperature is greater or equal to the peek of the stack then pop from the stack
package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Daily_Temperature {
	 public static int[] dailyTemperatures(int[] temperatures) {
	     Stack<Integer> stak = new Stack();
	     int n = temperatures.length;
	     int [] result = new int[n];
	     for(int i = n-1 ; i >= 0 ; i--) {
	    	 // pop elements if current temperature is greater or equal to peek element of stack
	    	 while(!stak.isEmpty() && temperatures[i] >= temperatures[stak.peek()]) {
	    		 stak.pop();
	    	 }
	    	 // if stack still contains the elemens then subtract the peek index from current index and stor in result
	    	 if(!stak.isEmpty()) {
	    		 result[i] = stak.peek()- i;
	    	 }
	    	 // push the current index to stack
	    	 stak.push(i);
	     }
	     return result;
	    }
	public static void main(String[] args) {
		
    int [] temp = {73,74,75,71,69,72,76,73};
    System.out.println(Arrays.toString(dailyTemperatures(temp)) );
	}

}
