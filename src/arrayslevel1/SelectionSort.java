package arrayslevel1;

public class SelectionSort {
	public static void main(String args[])
	{
		int[] arr = {5, 3, -1, -5, 9, -9};
		int len = arr.length;
		
		for(int i=0; i<len-1; i++){
			int minIndex = i;
			for(int j=i; j<len; j++) {
				
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
		}
		for(int item: arr) {
			System.out.print(item+" ");
		}
	}

}
