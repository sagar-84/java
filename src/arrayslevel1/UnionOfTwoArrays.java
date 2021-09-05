/*
 Given two arrays a[] and b[] of size n and m respectively. 
 The task is to find union between these two arrays.
 Union of the two arrays can be defined as the set containing distinct elements from both the arrays. 
 If there are repetitions, 
 then only one occurrence of element should be printed in union.
*/

/* 
 * Input:
	5 3
	1 2 3 4 5
	1 2 3
	Output: 
	5
	Explanation: 
	1, 2, 3, 4 and 5 are the
	elements which comes in the union set
	of both arrays. So count is 5.
*/

package arrayslevel1;

public class UnionOfTwoArrays {
	public static void main(String args[]) {
		int[] A = {9, 4, 3, 8, 7, 6};
		int[] B = {2, 6, 1, 8, 9};
		int m=A.length;
		int n=B.length;
		printUnion(A,B,m,n);
	}
	public static void printUnion(int[] arr1, int[] arr2, int len_Array1, int len_Array2) {
		// if the arr1[i]]<arr2[j] - > insert i to union array, increment i;
		
		// if the arr1[i]>arr2[j]  - > insert j to the union array, increment j;
		
		// if the arr1[i]==arr2[j]  - >insert any one of the ele to union array, increment i and j;
		
		// once the arr1 is completed add all the remaining element in arr2 to union array
		
		//int[] unionArray = {};
		
		//if(indexOfArray1>len_Array1|| indexOfArray2>len_Array2)  return -1;
		
		
	}
}
