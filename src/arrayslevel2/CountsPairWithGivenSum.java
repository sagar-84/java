package arrayslevel2;

public class CountsPairWithGivenSum {
	
	static void findPairs(int[] arr, int len, int sum) {
		int count=0;
		for(int i=0; i<len; i++) 
			for(int j=i+1; j<len; j++)
				if((arr[i] + arr[j]) == sum)
					count++;
		System.out.print(count);
	}
	public static void main(String[] args) {
		int[] a= { 1, 5, 7, -1, 5 };
		int n=a.length;
		int s=6;
		findPairs(a, n, s);
		
	}

}
