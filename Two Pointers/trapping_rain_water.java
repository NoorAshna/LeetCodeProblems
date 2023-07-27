// link to the problem is https://leetcode.com/problems/trapping-rain-water/
// for this solution we use two pointer instead of two arrays that most people use.
// the use of two pointers decreases the space complexity to O(1) while the time complexity
//    remains same as of using two arrays
// Time complexity is O(N)
package two_Pointers;

public class trapping_rain_water {
    public static int trap(int[] height) {
        
    	int left = 0;
    	int right = height.length - 1;
    	int leftMax = height[left];
    	int rightMax = height[right];
    	int water = 0;
    	while(left < right) {
    		if(leftMax <= rightMax) {
    		  left++;
    		  leftMax = Math.max(leftMax, height[left]);
    		  if(leftMax - height[left] > 0) water+= leftMax - height[left];
    		}
    		
    		else {
       		  right--;
       		  rightMax = Math.max(rightMax, height[right]);
       		if(rightMax - height[right] > 0) water+= rightMax - height[right];
    		}
    	}
    	return water;
    }
	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(height));

	}

}
