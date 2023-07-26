// Link to the problem is https://leetcode.com/problems/valid-palindrome/
// Steps to solve the question
// 1. convert the string to lower case 
// 2. remove the other characters except Alphabet and digits 
// 3. loop through half of the string and compare the first character to last one . increment the starting index and 
//      decrement the last index to compare the corresponding characters of the string
// Time complexity is O(N)
package two_Pointers;

public class Valid_Palindrome {
	  public static boolean isPalindrome(String s) {
	      s = s.toLowerCase(); // convert to lower case
	   
	      // remove the other characters except Alphabet and digits
	      // and store it in the str a string builder
	      StringBuilder str = new StringBuilder();
	      for(int i = 0 ; i < s.length() ; i++) {
	    	  if(Character.isDigit(s.charAt(i)) || Character.isAlphabetic(s.charAt(i))) {
	    		  str.append(s.charAt(i));
	    	  }
	      }
	      // check the starting and ending characters for matching
	      // thus it will check for all the characters at str
	      int last = str.length()-1;
	      for(int i = 0 ; i < str.length()/2 ; i++) {
	    	  if(str.charAt(i) != str.charAt(last-i)) return false; // if not match return false
	      }
	      
		  return true;
	    }

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));

	}}

	// Another Solution
    // in this soluiton we maintain two pointers. One from start and one from last
    // the while will check till start pointer <= last pointer
    // the conditions we added is 1. if character is not digit or letter we just increment the start pointer or last pointer
    // 2. if both are digit or letter then we convert to lower case and compare the equality
    // It is a better solution
//   public static boolean isPalindrome(String s) {
//	 if (s.isEmpty()) {
//     	return true;
//     }
//     int start = 0;
//     int last = s.length() - 1;
//     while(start <= last) {
//     	char currentFirst = s.charAt(start);
//     	char currentLast = s.charAt(last);
//     	if (!Character.isLetterOrDigit(currentFirst )) {
//     		start++;
//     	} else if(!Character.isLetterOrDigit(currentLast)) {
//     		last--;
//     	} else {
//     		if (Character.toLowerCase(currentFirst) != Character.toLowerCase(currentLast)) {
//     			return false;
//     		}
//     		start++;
//     		last--;
//     	}
//     }
//     return true;


