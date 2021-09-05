// Best solution
//int[] nums={6,-1,-2,-3,0,1,2,3,4};
//Arrays.sort(nums);
//System.out.println("Minimum = " + nums[0]);
//System.out.println("Maximum = " + nums[nums.length-1]);


package arrayslevel1;

import java.util.Arrays;

public class MinMax {
	
//	//Min
//	public static void minValue(int arr[]) {
//		int minValue = arr[0];
//		int len = arr.length;
//		for (int i = 0; i <len; i++) {
//			if(arr[i]< minValue) {
//				minValue = arr[i];
//			}	
//		}
//		System.out.print("Min "+minValue);
//		
//	}
//	
//	//Max
//	public static void maxValue(int arr[]) {
//		int maxValue = arr[0];
//		int len = arr.length;
//		for (int i = 0; i<len; i++) {
//			if(arr[i]> maxValue) {
//				maxValue = arr[i];
//			}
//		}
//		System.out.print("Max " +maxValue);
//		
//	}
	public static void minMax(int arr[]) {
		int l = arr.length;
		Arrays.sort(arr);
		System.out.println("Max "+arr[l-1]);
		System.out.print("Min "+arr[0]);
	}
	public static void main(String args[]) {
		int[] A = {3, 2, 1, 56, 100, 677};
		//MinMax obj = new MinMax();
		//minValue(A);
		//maxValue(A);
		minMax(A);
		
		
	}
}
