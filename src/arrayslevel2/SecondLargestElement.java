package arrayslevel2;

public class SecondLargestElement {
		
		static void findSecondLargest(int[] arr, int len) {
			//Let me sort the array
			int temp=0;
			for(int i=0; i<len; i++) {
				for(int j=i+1; j<len; j++) {
					if(arr[i]>arr[j]) {
						temp = arr[i];
						arr[i]= arr[j];
						arr[j] = temp;
					}
				}
			}
			// last but one element should be the second largest.
			System.out.print(arr[len-2]);
		}
		public static void main(String[] args) {
		  int[] a = {1,2,5,4,3,6,7};
		  int l =a.length;
		findSecondLargest(a,l);
				  
		}
}
