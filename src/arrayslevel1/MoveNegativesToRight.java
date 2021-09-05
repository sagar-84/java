package arrayslevel1;

public class MoveNegativesToRight {
	
	static void segregate(int[] arr, int len) {
		
		int[] temp_Arr = new int[len];
		int j=0;
		
		//positive
		for(int i=0; i<len; i++) {
			if(arr[i]>=0)
				temp_Arr[j++] = arr[i];
		}
		
		//Negative
		for(int i=0; i<len; i++) {
			if(arr[i]<0)
				temp_Arr[j++] = arr[i];
		}
		
		//temp_Arr to arr
		for(int i=0; i<len; i++) {
			 arr[i]=temp_Arr[i];
		}
	}
	public static void main(String args[]){
		int[] a = {-5, 7, -3, -4, 9, 10, -1, 11};
		int l= a.length;
		for(int i=0; i<l; i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println();
		segregate(a,l);
		for(int i=0; i<l; i++) {
			System.out.print(" "+a[i]);
		}
	}
}
