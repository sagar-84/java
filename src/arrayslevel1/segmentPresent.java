// Given an array arr[] and size of array is n and one another key x, and give you a segment size k. 
// The task is to find that the key x present in every segment of size k in arr[].

package arrayslevel1;

public class segmentPresent {
	
	static boolean findxinkindowSize(int len, int[] arr,
									int ele, int segment)
	{
		int i;
		boolean b = false;
	
		// Iterate from 0 to N - 1
		for (i = 0; i < len; i = i + segment) {
			System.out.println("value of i "+i);
		
			// Iterate from 0 to k - 1
			for (int j = 0; j < segment; j++) {
				System.out.println("value of j "+j);
				if (i + j < len && arr[i + j] == ele) {
					System.out.println("first if executed");
					break;
				}
				if (j == segment) {
					System.out.println("second if executed");
					return false;
				}
					
				if (i + j >= len) {
					System.out.println("third if executed");
					return false;
				}
					
			}
		}
		if (i >= len) {
			System.out.println("fourth if executed");
			return true;
		}
		else
			return b;
	}

	// Driver Code
	public static void main(String args[])
	{
		int arr[] = new int[] { 3, 5, 2, 4, 9, 1,
								3, 7, 9, 11, 12, 3};
		int x = 3, k = 3;
		int n = arr.length;
		if (findxinkindowSize(n, arr, x, k))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
