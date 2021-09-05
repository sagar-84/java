package arrayProgramsGeeksForGeeks;

//Given a sorted array and a number x, find the pair in array whose sum is closest to x

// LINK - https://www.techiedelight.com/find-closest-pair-two-sorted-arrays/


/*Solution - 
We will maintain two indexes one at beginning (l=0) and one at end (r=n-1)
iterate until l <  r
Calculate diff as arr[l] + arr[r]-x
if abs (diff) < minDiff then update the minimum sum and pair.
If arr[l] + arr[r] is less than X, this means if we want to find sum close to X, do r–
If arr[l] + arr[r] is greater than 0,this means if we want to find sum close to X , do l++
*/

public class FindPairWithClosestToX {
	
		 
	static void findPairWithClosestToX(int arr[], int n, int x) 
    { 
        int res_l=0, res_r=0;  // To store indexes of result pair 
   
        // Initialize left and right indexes and difference between 
        // pair sum and x 
        int l = 0, r = n-1, diff = Integer.MAX_VALUE; 
   
        // While there are elements between l and r 
        while (r > l) 
        { 
            // Check if this pair is closer than the closest pair so far 
            if (Math.abs(arr[l] + arr[r] - x) < diff) 
            { 
               res_l = l; 
               res_r = r; 
               diff = Math.abs(arr[l] + arr[r] - x); 
            } 
   
            // If this pair has more sum, move to smaller values. 
            if (arr[l] + arr[r] > x) 
               r--; 
            else // Move to larger values 
               l++; 
        } 
   
    System.out.println(" The closest pair is "+arr[res_l]+" and "+ arr[res_r]); 
} 
	
	public static void main(String[] args)
    {
		int arr[] =  {10, 22, 28, 29, 30, 40}, x = 54; 
        int n = arr.length; 
        findPairWithClosestToX(arr, n, x);      
    }
}


