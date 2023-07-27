// Link to the question is https://leetcode.com/problems/container-with-most-water/
// we maintain two pointers to solve the question
// first pointer is from left most of array and second one is from right most of array
// we move the corresponding pointer towards right or left whose height is smaller
// we calculate area by picking the minimum height of two pointers and distance between them
// Time complexity is O(N)
package two_Pointers;

public class Container_With_Most_Water {
	 public static int maxArea(int[] height) {
	        int left = 0;
	        int right = height.length - 1;
	        int max_Area = 0;
	        while(left < right) {
	        	int minHeight = Math.min(height[left], height[right]);
	        	max_Area = Math.max(max_Area, minHeight*(right - left));
	        	if(height[left] < height[right]) left++;
	        	else right--;
	        }
	        return max_Area;
	    }
	public static void main(String[] args) {
		int [] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));

	}

}
