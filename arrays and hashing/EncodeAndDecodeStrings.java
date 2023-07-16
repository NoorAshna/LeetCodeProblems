// link to the problem is https://leetcode.com/problems/encode-and-decode-strings/
// we encode it by appending the length of next string and '#'
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
	 public String encode(List<String> strs) {
		 StringBuilder sb = new StringBuilder();
		 for(String s : strs) {
			 sb.append(s.length());
			 sb.append("#");
			 sb.append(s);
		 }
		return sb.toString();
	        
	    }
// decode it according to encoding. get the length  of the next string from and str and add the string to the arraylist
public static List<String> decode(String str) {
	      List<String> res = new ArrayList<>();
	      char[] ch = str.toCharArray();
	      for(int i = 0 ; i < ch.length ; i++) {
	    	  if(ch[i] == '#') {
	    		 int count = Character.getNumericValue(ch[i-1]);
	    		 System.out.println(count);
	    		 StringBuilder st = new StringBuilder();
	    		 int current = i+1;
	    		 for(int j = 0 ; j < count ; j++) {
	    			 
	    			st.append(ch[current]); 
	    			current++;
	    		 }
	    		 res.add(st.toString());
	    		 i+=count;
	    	  }
	      }
	      return res;
	    }
	public static void main(String[] args) {
		String str = "4#leet4#code";
		System.out.println(decode(str));

	}

}
