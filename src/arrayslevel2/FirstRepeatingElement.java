package arrayslevel2;

public class FirstRepeatingElement {
	static void checkIf(int[] arr, int len) {
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[i]==arr[j]) {
					System.out.print("The value "+arr[j]);
					System.out.println();
					System.out.print("The index "+j);
					System.out.println();
					break;
				}
			}
		}
	}
	public static void main(String arg[]) {
		int[] a = {2,54,5,2,9,2,10,6,10};
		int l = a.length;
		checkIf(a,l);		
	}
}
