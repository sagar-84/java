package arrayslevel1;

public class OccurancesArrayElement {
	public static int frequencyFinder(int[] arr, int ele) {
		int len = arr.length;
		int count = 0;
		for (int i = 0; i<len; i++) {
			if(arr[i]==ele) {
				count ++;
			}
		}
		return count;
		
	}
	public static void main(String args[]) {
		//Integer[] b = new Integer[] {2,3,4,5,6,7,2,2,2};
		int[] a = {3, 5, 6, 7, 8, 3, 4, 3, 3,33};
		int x = 3;
		System.out.print(frequencyFinder(a,x)); // 4
	}
}
