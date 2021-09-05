package interview2021;

public class searchIn2DArray {
	// Java program to search an element in row-wise
	// and column-wise sorted matrix

	static int search(int[][] mat, int n, int x)
	{
		if (n == 0)
		return -1;

		// traverse through the matrix
		for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++)
			// if the element is found
			if (mat[i][j] == x) {
			System.out.print("Element found at ("
							+ i + ", " + j
							+ ")\n");
			return 1;
			}
		}

		System.out.print(" Element not found");
		return 0;
	}
	public static void main(String[] args)
	{
		int mat[][] = { { 10, 20, 30, 40 },
					{ 15, 25, 35, 45 },
					{ 27, 29, 37, 48 },
					{ 32, 33, 39, 50 } };

		search(mat, 4, 29);
	}

}

// second solution


//JAVA Code for Search in a row wise and
//column wise sorted matrix

class GFG {

	/* Searches the element x in mat[][]. If the
	element is found, then prints its position
	and returns true, otherwise prints "not found"
	and returns false */
	private static void search(int[][] mat,
									int n, int x)
	{
		
		// set indexes for top right
		int i = 0, j = n - 1;
		// element

		while (i < n && j >= 0)
		{
			if (mat[i][j] == x)
			{
				System.out.print("n Found at " +
									i + " " + j);
				return;
			}
			if (mat[i][j] > x)
				j--;
			else // if mat[i][j] < x
				i++;
		}

		System.out.print("n Element not found");
		return; // if ( i==n || j== -1 )
	}
	// driver program to test above function
	public static void main(String[] args)
	{
		int mat[][] = { { 10, 20, 30, 40 },
						{ 15, 25, 35, 45 },
						{ 27, 29, 37, 48 },
						{ 32, 33, 39, 50 } };

		search(mat, 4, 29);
	}
}
//This code is contributed by Arnav Kr. Mandal.


