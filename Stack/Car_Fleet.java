// Link ot the problem is https://leetcode.com/problems/car-fleet/description/
// To solve the problem we need to compare the speed of the car after then arranging them according to the position 
// if the current car speed is greater than the next one then the fleet is increased
package Stack;

import java.util.Arrays;

public class Car_Fleet {
	 public static int carFleet(int target, int[] position, int[] speed) {
	      int n = position.length;
	   // store the position and speed of the car in carData [][]
	      double [][] carData = new double[n][2];
	      for(int i = 0 ; i < n ; i++) {
	    	  carData[i][0] = position[i]*1d;
	    	  carData[i][1] = (target - position[i]*1d)/speed[i];
	      }
	     // sort the carData through the position
	      Arrays.sort(carData,(a,b)->(Double.compare(a[0], b[0])));
	      int fleet = 1;
	      double tt = carData[n-1][1];// get the time of the last car
	      //reverse iterate through the carData to start from the last positioned car
	      // if the speed of the car is greater than the next car then fleet++
	      for(int i = n-2 ; i >= 0 ; i--) {
	    	  if(carData[i][1] > tt) {
	    		  fleet++;
	    		  tt = carData[i][1];
	    	  }
	      }
	      return fleet;
	    }
	public static void main(String[] args) {
		int [] position = {10,8,0,5,3};
		int [] speed = {2,4,1,1,3};
        int target = 12;
        System.out.println(carFleet(target , position , speed));
		

	}

}
 