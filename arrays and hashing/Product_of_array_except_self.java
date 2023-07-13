// link to the problem is https://leetcode.com/problems/product-of-array-except-self/
import java.util.Arrays;

public class Product_of_array_except_self {
 public static int[] productExceptSelf(int[] nums) {
     int len = nums.length;
	 int [] res = new int[len]; 
	 int  ProdBeforeCurrent = 1;
	 int  ProdAfterCurrent = 1;
     
	 for(int i = 0 ; i < len ; i++) {
		 res[i]= ProdBeforeCurrent;
		 ProdBeforeCurrent *= nums[i];
	 }
	 for(int i = len-1 ; i >= 0 ; i--) {
		 res[i] *= ProdAfterCurrent;
		 ProdAfterCurrent *= nums[i];
	 }
	 return res;
    }
	public static void main(String[] args) {
		int [] nums = new int[] {1,2,3,4};
		int res[] = productExceptSelf(nums);
		System.out.println(Arrays.toString(res));
		}

}
