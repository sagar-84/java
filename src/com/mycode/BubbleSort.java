package com.mycode;

public class BubbleSort {
	public static void main(String args[]) {
		int[] arr = {-5, 7, -3, -4, 9, 10, -1, 11};
		int len = arr.length;
		boolean flag = true;
		for(int i = 0; i<len-1; i++) {
			for(int j = 0; j<len-1-i; j++)
			{
				if(arr[j+1] > arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					
					flag = false;
				}
			}
			if(flag) break;
		}
		for(int item: arr) {
			System.out.print(item+ " ");
		}
		
	}
}
