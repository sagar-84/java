/*Given an unsorted array having both negative and positive integers. 
 * The task is place all negative element at the end of array without changing 
 * the order of positive element and negative element.*/

/*
	A[] = {1, -1, 3, 2, -7, -5, 11, 6 }
	Output : 
	1  3  2  11  6  -1  -7  -5
*/
package arrayslevel1;

public class SortNegativeToRight {
	public static void main(String[] args) {
		int[] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
		int len = arr.length;
		moveAllToRight(arr,len);
	}

	public static void moveAllToRight(int[] a, int len) {
		// code 
		int[] temparr = new int[len];
		for(int i = 0; i<len; i++) {
			
		}
	}
}
