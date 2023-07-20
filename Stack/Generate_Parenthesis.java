// Link to the problem is https://leetcode.com/problems/generate-parentheses/
// we use recursion to solve the problem
// the recursive method we passes the output_arr (result array) , curr_str( current string to store the parenthesis), open count , close count and n

package Stack;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis {
	 public static List<String> generateParenthesis(int n) {
	       List<String> output_arr = new ArrayList();
	       backtrack(output_arr , "" , 0 , 0, n);
	       return output_arr;
	    }
	 public static void backtrack(List<String> output_arr ,String curr_str , int open, int close, int max) {
		 // add the string to result array is string length is max*2 e.g if input is 3 then the string must be of 6 "((()))"
		 if(curr_str.length() == max*2) {
			 output_arr.add(curr_str);
			 return;
		 }
		 // call the function recursively when open brackets are greater than "n" e.g 3
		 if(open < max) backtrack(output_arr ,curr_str + "(" , open + 1, close, max);
		 // call the function when close is less than open because we can not add close bracket when open is < than or = to close
		 if(close < open)backtrack(output_arr , curr_str + ")" , open , close + 1 , max);
	 }
	public static void main(String[] args) {
		int n = 3;
		System.out.println(generateParenthesis(n));

	}

}
