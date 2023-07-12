// link to the problem is https://leetcode.com/problems/top-k-frequent-elements/
// There other methods to solve it like priority Queue but the question demands complexity better than O(nlog n)
// So in the following code we use bucket sort to solve the question. first we use the hashmap to find the frequency of each element
// then we use bucket sort to sort the top K frequent elements.
// bucket sort is basically an array with index as frequency. we put the elements in the index of array based on frequency
// time complexity is O(n)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top_K_Frequent_Elements {
	 public static int[] topKFrequent(int[] nums, int k) {
	        int [] result = new int[k];
	        Map<Integer,Integer> count = new HashMap<>();
	        for(int i: nums) {
	        	count.put(i, count.getOrDefault(i, 0)+1);
	        }
	        List<Integer>[] bucket = new List[nums.length+1];
	        for(int i = 0 ; i < bucket.length; i++) {
	        	bucket[i]=new ArrayList<>();
	        }
	        // putting values in the bucket based on frequency
	        for(int i : count.keySet()) {
	        	bucket[count.get(i)].add(i);
	        }
	        List<Integer> temp = new ArrayList<>();
	        for(int i = bucket.length - 1 ; i >= 0; i--) {
             		temp.addAll(bucket[i]);
	        }
	        while(k-- > 0) {
	        	result[k] = temp.get(k);
	        }
	        
	        	return result;
	    }
	public static void main(String[] args) {
		
		int[]nums = new int[] {1,1,1,2,2,3};
        int k = 2;
        int [] result = topKFrequent(nums,k);
        System.out.println(Arrays.toString(result));
	}

}
