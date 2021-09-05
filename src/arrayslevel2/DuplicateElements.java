package arrayslevel2;

public class DuplicateElements {
	static void findDup(int[] arr, int len) {
		int count =0;
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[i]==arr[j]&& i!=j) {
					System.out.println(" "+arr[i]);
				}
				
			}
		
		}
	}
	public static void main(String[] args) {
		int[] a = {2,3,1,2,1,4,4};
		int l = a.length;
		findDup(a,l);
	}

}
