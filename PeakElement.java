package arrayProgramsGeeksForGeeks;

/*
 * Find a peak element - An array element is a peak if it is NOT smaller than its neighbours
 * 
 * LINK - https://www.techiedelight.com/find-peak-element-array/
 * 
 * If in the array, the first element is greater than the second or the last 
 * element is greater than the second last, 
 * print the respective element and terminate the program.
 * 
Else traverse the array from the second index to the second last index
If for an element array[i], it is greater than both its neighbours, i.e.,
 array[i] > array[i-1] and array[i] > array[i+1], then print that element and terminate.
 */
public class PeakElement {

	//Find the peak element in the array
	static int findPeak(int arr[], int n)
	{
		
		// First or last element is peak element
		if (n == 1)
		return 0;
		if (arr[0] >= arr[1])
			return 0;
		if (arr[n - 1] >= arr[n - 2])
			return n - 1;

		// Check for every other element
		for(int i = 1; i < n - 1; i++)
		{
			
			// Check if the neighbors are smaller
			if (arr[i] >= arr[i - 1] &&
				arr[i] >= arr[i + 1])
				return i;
		}
		return 0;
	}

	//Driver Code
	public static void main(String[] args)
	{
		int arr[] = { 1, 3, 20, 4, 1, 0};
		int n = arr.length;
		
		System.out.print("Index of a peak point is " +
						findPeak(arr, n));
	}
}

	



