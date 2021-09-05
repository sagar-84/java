package arrayslevel1;
/*Count the number of 0’s, 1’s and 2’s. After Counting, put all 0’s first, 
then 1’s and lastly 2’s in the array.
We traverse the array two times. Time complexity will be O(n). */
public class OnesZerosTwosCounting {
	public static void sortedArray(int[] arr) {
		
		int len=arr.length;
		int zerosCounter = 0;
		int onesCounter = 0;
		int twosCounter = 0;
		
		for(int i =0; i<len; i++)
		{
			if(arr[i]==0)
				zerosCounter++;
		    if(arr[i]==1)
				onesCounter++;
			if(arr[i]==2)
				twosCounter++;
		}
		
		//putting all the zeros in the beginning of the new array
		for(int i = 0; i<zerosCounter; i++)
			arr[i] = 0;

		//putting all the ones in the beginning of the new array
		for(int i = zerosCounter; i<(zerosCounter+onesCounter); i++) 
			arr[i]= 1;
		
		//putting all the twos in the beginning of the new array
		for(int i = (zerosCounter+onesCounter); i<len; i++) 
			arr[i]= 2;
	
		printNewArray(arr);
		
	}
	public static void printNewArray(int[] arr) {
		int len = arr.length;
		for(int i = 0; i<len; i++) {
			System.out.print(arr[i]+"");
			//System.out.println("");
		}
	}
	public static void main(String args[]) {
		int[] a = {0,1,0,2,0,1,0,2,2,2,1,1,1,0,2,0,1};
		sortedArray(a);
	}

}
