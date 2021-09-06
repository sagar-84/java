package arrayProgramsGeeksForGeeks;


// LINK - https://www.geeksforgeeks.org/non-repeating-element/

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingArray {
	
	static int firstNonRepeating(int arr[], int n)
    {
        // Insert all array elements in hash
        // table
 // A Map doesn't allow duplicate keys, but you can have duplicate values. HashMap and LinkedHashMap allow null keys and values, 
// but TreeMap doesn't allow any null key or value.
		
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
        	// containsKey - This method returns true if some key equal to the key exists within the map, else return false.
            if (m.containsKey(arr[i])) {
            	// put - Insert an entry in map
            	// get - This method returns the object that contains the value associated with the key.
                m.put(arr[i], m.get(arr[i]) + 1);
            }
            else {
                m.put(arr[i], 1);
            }
        }
        // Traverse array again and return
        // first element with count 1.
        for (int i = 0; i < n; i++)
            if (m.get(arr[i]) == 1)
                return arr[i];
        return -1;
    }
	public static void main(String[] args)
    {
        int arr[] = { 9, 4, 9, 6, 7, 4 };
        int n = arr.length;
        System.out.println(firstNonRepeating(arr, n));
    }
		
}
