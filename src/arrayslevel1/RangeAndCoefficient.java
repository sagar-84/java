
/*Given an array arr of integer elements, the task is to find the range and coefficient 
of range of the given array where: 
Range: Difference between the maximum value and the minimum value in the distribution. 
Coefficient of Range: (Max – Min) / (Max + Min).*/

/*Input: arr[] = {15, 16, 10, 9, 6, 7, 17} 
Output: Range : 11 
Coefficient of Range : 0.478261 
Max = 17, Min = 6 
Range = Max – Min = 17 – 6 = 11 
Coefficient of Range = (Max – Min) / (Max + Min) = 11 / 23 = 0.478261
Input: arr[] = {5, 10, 15} 
Output: Range : 10 
Coefficient of Range : 0.5 */

package arrayslevel1;

import java.util.Arrays;

public class RangeAndCoefficient {
	
	// get min
	 static float getMin(float[] arr, int len) {
		 float res = arr[0];
		 for(int i = 0; i<len; i++) {
			 res = Math.min(res, arr[i]);
		 }
		return res;
	}
	// get max
	 static float getMax(float[] arr, int len) {
		 float res = arr[0];
		 for(int i = 0; i<len; i++) {
			 res = Math.max(res, arr[i]);
		 }
		return res;
	}
	public static void rangeAndCoefficient(float[] arr, int len) {
		// sort the array
		// Arrays.sort(arr);
		float max = getMax(arr, len);
		float min = getMin(arr, len);
		float range = 0;
//		float min = arr[0];
//		float max = arr[len-1];
		range = max-min;
		
		float coefficient;
		coefficient = (max-min)/(max+min);
		System.out.println("Range "+range);
		System.out.println("Coefficient "+coefficient);
	}
	
	
	// take min and out after sorting
	
	//method to find range
	
	
	//method to find coefficient
	
	public static void main(String args[]) {
		float[] a = {15, 16, 10, 9, 6, 7, 17};
		int len = a.length;
		rangeAndCoefficient(a, len);
		
	}

}
