package arrayslevel2;

public class MissingInteger {
	 static void findIt(int[] arr, int len) {
		 int sumOfArr = 0;
		 int sumOfNElements=0;
		 
		 //sum of N natural number
		 int totalNumbers = len+1;
		 sumOfNElements = totalNumbers * (totalNumbers+1)/2;
		 
		 //sum of given array
		 for(int i=0; i<len; i++) {
			 sumOfArr = arr[i]+sumOfArr;
		 }
		 
		 int diff = sumOfNElements - sumOfArr;
		 
		 System.out.print("The missing number " +diff);
	 }
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 8};
		int l=a.length;
		findIt(a,l);
	}
	

}
