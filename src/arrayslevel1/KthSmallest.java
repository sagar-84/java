package arrayslevel1;

import java.util.Arrays;

public class KthSmallest {
	public static int kthSmallestElement(int[] arr, int ele) {
		Arrays.sort(arr);
		
		return	arr[ele - 1];
	}
	public static void main(String args[]) {
		int[] a = {3, 1, 2, 9, 7, -1, 5, 8};
		int k = 3; // return 2 as the 3rd smallest element in arr
		System.out.print(kthSmallestElement(a, k));
		
	}
}


//Java code for kth smallest element
//in an array

/*import java.util.Arrays;
import java.util.Collections;

class GFG {
	// Function to return k'th smallest
	// element in a given array
	public static int kthSmallest(Integer[] arr,
								int k)
	{
		// Sort the given array
		Arrays.sort(arr);

		// Return k'th element in
		// the sorted array
		return arr[k - 1];
	}

	// driver program
	public static void main(String[] args)
	{
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		int k = 2;
		System.out.print("K'th smallest element is " + kthSmallest(arr, k));
	}
}*/

