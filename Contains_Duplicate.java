// Below code first sorts the array then compares each element of the array to the proceeding one
// to finds the duplicate. If found return ture else false 
// Time Complexity is O(n) 
//Link to the problem is https://leetcode.com/problems/contains-duplicate/
import java.util.Arrays;

public class Contains_Duplicate {
	 public static boolean containsDuplicate(int[] nums) {
	        Arrays.sort(nums); 
	        for (int i = 0; i < nums.length - 1; i++) {
	                if (nums[i] == nums[i+1]) {

	                    return true;
	                }
	        }
	        return false;
	    }
		public static void main(String[] args) {
//		int [] arr= new int[]{1,2,3,1};	
		boolean res = containsDuplicate(new int[] {1,2,3,1});
		System.out.print(res);
		}
}

