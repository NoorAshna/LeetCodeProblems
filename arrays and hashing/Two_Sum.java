// Link to the problem is https://leetcode.com/problems/two-sum/
// the code uses hashmap to solve the problem because brute force method increases the time complexity
// in the map we put the key as integer value of nums and value as the index of nums
// we subtract the value of nums from target to find the next value from the map.
// e.g 7-9=2 . so we find the 2 from map and returns the value of 2 which is 0 (here key is 2 and value is 0 in the hashmap)and the also the value of current index of loop which is 1
// if we put all the values in the Hashmap, it looks like this 2=0,7=1,11=2,15=3 (key value)
// Time complexity is O(n)
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
	 public static int[] twoSum(int[] nums, int target) {
	        
	      Map<Integer,Integer> map = new HashMap<>();
	    for(int i=0; i<nums.length; i++){
	       int find = target - nums[i];
	       if(map.containsKey(find)){
	           
	           return new int[] {map.get(find),i};
	       }
	        
	     map.put(nums[i],i);
	    }
	        return null;
	    }
	public static void main(String[] args) {
	int [] num = new int[] {2,7,11,15};
	int target = 9;
	int [] res = twoSum(num, target);
	System.out.println(Arrays.toString(res));

	}

}
