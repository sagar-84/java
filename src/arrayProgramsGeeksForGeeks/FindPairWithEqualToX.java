package arrayProgramsGeeksForGeeks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPairWithEqualToX {
	
// LINK - https://www.techiedelight.com/find-pair-with-given-sum-array/
	
	
 // Function to find a pair in an array with a given sum using hashing
    public static void findPair(int[] A, int target)
    {
        // create an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();
 
        // do for each element
        for (int i = 0; i < A.length; i++)
        {
            // check if pair `(A[i], target-A[i])` exists
 
            // if the difference is seen before, print the pair
            if (map.containsKey(target - A[i]))
            {
                System.out.printf("Pair found (%d, %d)", A[map.get(target - A[i])], A[i]);
                return;
            }
 
            // store index of the current element in the map
            map.put(A[i], i);
        }
 
        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }
    
    
    // second way of doing it 
    public static void findPair2(int[] A, int target)
    {
        // consider each element except the last
        for (int i = 0; i < A.length - 1; i++)
        {
            // start from the i'th element until the last element
            for (int j = i + 1; j < A.length; j++)
            {
                // if the desired sum is found, print it
                if (A[i] + A[j] == target)
                {
                    System.out.println("Pair found (" + A[i] + ", " + A[j] + ")");
                    return;
                }
            }
        }
 
        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }
    
    // Third way of doing it 
    
 // Function to find a pair in an array with a given sum using sorting
    public static void findPair3(int[] A, int target)
    {
        // sort the array in ascending order
        Arrays.sort(A);
 
        // maintain two indices pointing to end points of the array
        int low = 0;
        int high = A.length - 1;
 
        // reduce the search space `A[low…high]` at each iteration of the loop
 
        // loop till the search space is exhausted
        while (low < high)
        {
            // sum found
            if (A[low] + A[high] == target)
            {
                System.out.println("Pair found (" + A[low] + ", " + A[high] + ")");
                return;
            }
 
            // increment `low` index if the total is less than the desired sum;
            // decrement `high` index if the total is more than the desired sum
            if (A[low] + A[high] < target) {
                low++;
            }
            else {
                high--;
            }
        }
 
        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }
 
    public static void main (String[] args)
    {
        int[] A = { 8, 7, 2, 5, 3, 1 };
        int target = 10;
 
        findPair(A, target);
    }
	
}
