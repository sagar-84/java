package arrayProgramsGeeksForGeeks;

/*
 * Find subarray with given sum | Set 1 (Nonnegative Numbers)
Simple Approach: A simple solution is to consider all subarrays one by one and check the sum of every subarray. Following program implements the simple solution. Run two loops: the outer loop picks a starting point I and the inner loop tries all subarrays starting from i.
Algorithm:  

Traverse the array from start to end.
From every index start another loop from i to the end of array to get all subarray starting from i, keep a variable sum to calculate the sum.
For every index in inner loop update sum = sum + array[j]
If the sum is equal to the given sum then print the subarray.
 */
// LINK - FIND ALL SUBARRAYS - https://www.techiedelight.com/find-subarrays-given-sum-array/
// LINK - FIND A SUBARRAY - https://www.techiedelight.com/find-subarray-having-given-sum-given-array/


public class SubArrayWithGivenSum {

	/* Returns true if the there is a
subarray of arr[] with a sum equal to
	'sum' otherwise returns false.
Also, prints the result */
	
	int subArraySum(int arr[], int n, int sum)
	{
		int curr_sum, i, j;

		// Pick a starting point
		for (i = 0; i < n; i++) {
			curr_sum = arr[i];

			// try all subarrays starting with 'i'
			for (j = i + 1; j <= n; j++) {
				if (curr_sum == sum) {
					int p = j - 1;
					System.out.println(
						"Sum found between indexes " + i
						+ " and " + p);
					return 1;
				}
				if (curr_sum > sum || j == n)
					break;
				curr_sum = curr_sum + arr[j];
			}
		}

		System.out.println("No subarray found");
		return 0;
	}

	public static void main(String[] args)
	{
		SubArrayWithGivenSum arraysum = new SubArrayWithGivenSum();
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int n = arr.length;
		int sum = 23;
		arraysum.subArraySum(arr, n, sum);
	}
}

