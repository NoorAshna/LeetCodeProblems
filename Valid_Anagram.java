// Link to the problem is https://leetcode.com/problems/valid-anagram/
// This code first compares the length of the string. if not same return false 
// then make an array of size 26 considering size of alphabets
// in the array we counts the occurrence of every alphabets in both the strings.
// if any occurrence is not equal to 0 then it is not anagram
// Time complexity is O(n)
public class Valid_Anagram {

	 public static boolean isAnagram(String s, String t) {
	      
	        if(s.length() != t.length()) return false;
	       
	        int[] arr = new int[26];
	        
	        for(int i=0 ; i<s.length(); i++){
	            arr[s.charAt(i) - 'a']++;
	            arr[t.charAt(i) - 'a']--;
	        }
	        
	        for(int count : arr){
	            if(count != 0) return false;
	        }
	        return true;
	    }
	public static void main(String[] args) {
	   String str1 = "anagram";
	   String str2 = "nagaram";
	   // Check for false 
//	   String str1 = "cat";
//	   String str2 = "rat";
		boolean res = isAnagram(str1 , str2);
   System.out.print(res);
	}

}
