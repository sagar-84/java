package interview2021;

import java.util.Scanner;

public class SpiralArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		int[][] arr = new int[n][m];
		for(int i =0; i< arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		int min_r = 0;
		int min_c = 0;
		int max_r = arr.length-1;
		int max_c = arr[0].length-1;
		int tne = n*m;
		int count = 0;
		
		while(count < tne) {
			
			//left wall -  i moves from min row to max row j stays in min column
			for(int i = min_r, j = min_c; i <= max_r && count<tne; i++) {
				System.out.println(arr[i][j]);
				count ++;
			}
			min_c++;
			
			
			//bottom wall - i stays at max row, j moves from min column to max column
			
			for(int i = max_r, j = min_c; j <= max_c && count<tne; j++) {
				System.out.println(arr[i][j]);
				count ++;
			}
			max_r--;
			
			//right wall - i moves from max row to min row, j stays in max column
			
			for(int i = max_r, j = max_c; i >= min_r && count<tne; i--) {
				System.out.println(arr[i][j]);
				count ++;
			}
			max_c--;
			
			//top wall
			for(int i = min_r, j = max_c; j >= min_c && count<tne; j--) {
				System.out.println(arr[i][j]);
				count ++;
			}
			min_r++;
			
		}
	}
}
