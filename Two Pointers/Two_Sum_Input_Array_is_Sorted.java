// Link to the problem is https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// we use two pointers to solve the question because we have sorted array
// if the array is not sorted then better to use hashmaps to solve the question
// 1. we have two pointer left most (left) and right most (right)
// 2. the while loop checks for the result.
// 3. in the while loop we check if the sum of numbers of left index and right index is less than target then move
//    left pointer to right else move right pointer to left
// Time complexity is O(N)
package two_Pointers;

import java.util.Arrays;

public class Two_Sum_Input_Array_is_Sorted {
	  public static int[] twoSum(int[] numbers, int target) {
	        int left = 0;
			int right = numbers.length - 1;
			int [] result = new int[2];
            while(numbers[left] + numbers[right] != target) {
            int sum = numbers[left] + numbers[right];
            if(sum < target) {
            	left++;
            }
            else  {
            	right--;
            }
           
            }
          return new int[] {left+1 , right+1};
	}
	public static void main(String[] args) {
		int[] number = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(number , target)));

	}

}
