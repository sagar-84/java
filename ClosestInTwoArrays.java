package interview2021;

public class ClosestInTwoArrays {
// LINK - https://www.techiedelight.com/find-closest-pair-two-sorted-arrays/
	
    // Function to find the closest pair to `target` in given sorted arrays
    // `first` and `second`
    private static void findClosestPair(int[] first, int[] second, int target)
    {
        // base case
        if (first.length == 0 || second.length == 0) {
            return;
        }
 
        /* `x` and `y` points to the indexes of the closest pair found so far */
 
        // `x` initially points at the beginning of the first array
        int x = 0;
 
        // `y` initially points at the end of the second array
        int y = second.length - 1;
 
        // `i` initially points at the beginning of the first array
        // `j` initially points at the end of the second array
 
        for (int i = 0, j = second.length - 1; i < first.length && j >= 0; )
        {
            // maintain a search space `first[i…]` and `second[…j]`
 
            // update the closest pair found so far if the current pair `(i, j)`
            // is closer to `target`
            if (Math.abs(first[i] + second[j] - target) < Math.abs(first[x] + second[y] - target))
            {
                x = i;
                y = j;
            }
 
            // if the sum of the current pair `(i, j)` is less than the given sum,
            // increment `i` (as an element at index `i+1` has more value than the
            // element at index `i`)
            if (first[i] + second[j] < target) {
                i++;
            }
            // if the sum of the current pair `(i, j)` is more than the given sum,
            // decrement `j` (as an element at index `j-1` has less value than the
            // element at index `j`)
            else if (first[i] + second[j] > target) {
                j--;
            }
            // otherwise, increment `i` and decrement `j`
            else {
                i++; j--;
            }
        }
 
        System.out.printf("The closest pair is [%d, %d]", first[x], second[y]);
    }
 
    public static void main(String[] args)
    {
        int[] first = { 1, 8, 10, 12 };
        int[] second = { 2, 4, 9, 15 };
        int target = 11;
 
        findClosestPair(first, second, target);
    }
}

