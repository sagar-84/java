package arrayslevel1;

/* The split() method of String class splits
 * a string in several strings based on the
 * delimiter passed as an argument to it
 */
public class ReverseArray {
	static void reverseArray(int[] arr, int len) {
		int start = 0;
		int end = len-1;
		int temp=0;
		while(start<end) {
			temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	
	}
	static void printArray(int[] arr, int len) {
		for(int i=0; i<len; i++) {
			System.out.print(" "+arr[i]);
		}
	}
	public static void main(String[] args) {
		
		int[] a = {9,2,3,1,5,6,7};
		int l = a.length;
		reverseArray(a,l);
		printArray(a,l);
	}

}
