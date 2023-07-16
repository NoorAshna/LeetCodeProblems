// link to the problem is https://leetcode.com/problems/longest-consecutive-sequence/
// first we add array elements to Set to remove duplicate. because set does not allow duplicate
// then iterate through nums and find if set contains previous element of the current one
// if it finds previous the continue. if not then remove the elements one by one from set and add total 
// the while loop will stop if it does not find the previous element to remove
// Time complexity is O(n)
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsectiveSequence {
	 public static int longestConsecutive(int[] nums) {
		 int max = 0;
	        Set<Integer> set = new HashSet<>();
	        for(int num : nums) 
	        	set.add(num);
	        for(int i : nums){
	            if(set.contains(i-1)) continue;
	            int total = 0;
	            while(set.remove(i++)){
	                total++;
	            }
	            if(total > max) max = total;
	        }
		return max;
		    
	    }
	public static void main(String[] args) {
		int [] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
	}

}
