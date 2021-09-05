/*Given an array, rotate the array by one position in clock-wise direction.*/

/*
 * 
 	Input:  arr[] = {1, 2, 3, 4, 5}
	Output: arr[] = {5, 1, 2, 3, 4}
*/

/*
 	1) Store last element in a variable say x. 
	2) Shift all elements one position ahead. 
	3) Replace first element of array with x.
 */
package arrayslevel2;
import java.util.Arrays;

public class CyclicRotateByOne {

	static int arr[] = new int[]{1, 2, 3, 4, 5};
	
	// Method for rotation
	static void rotate()
	{
		int x = arr[arr.length-1], i;
		for (i = arr.length-1; i > 0; i--)
			arr[i] = arr[i-1];
		arr[0] = x;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Given Array is");
		System.out.println(Arrays.toString(arr));
		
		rotate();
		
		System.out.println("Rotated Array is");
		System.out.println(Arrays.toString(arr));
	}

}
