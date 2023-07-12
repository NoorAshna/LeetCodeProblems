// one method is to sort the every element of the array and put in the hashmap as key and find the corrosponding elements through key. but its time complexity will be O(nlogn)
// In the following code we make a hash for each element of the array then put it in the hashmap as key.
// the value of hashmap will be the arraylist that matches the hash(key) in the hashmap.
// time complexity will be O(NK) where N is the length of Strs and K is the maximum length of string in Strs
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagram {
    
	  public static List<List<String>> groupAnagram(String[] Strs){
	      Map<String, List> map = new HashMap<>();
	      for( String s : Strs){
	      int[] count = new int[26];
	      for( char c : s.toCharArray()){
	      count[c - 'a']++;
	      }
	      // appending "#" to the key so the eliminate the duplicate hash of different string 
	      // e.g "aaaaaaaaaab" and "abbbbbbbbbbb" have same hash that is "111000..."
	      StringBuilder by = new   StringBuilder();
	      for(int i : count){
	      by.append('#');
	      by.append(i);
	      }
	      String key = by.toString();
	      if(!map.containsKey(key)){
	      map.put(key, new ArrayList<String>());
	}

	     map.get(key).add(s);
	  }
	  return new ArrayList(map.values());
	}
	  
	public static void main(String[] args) {
		String [] str = new String[] {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> res = groupAnagram(str);
		System.out.println(res);

	}

}
