package numberPatterns;

public class DecreasingTraingle {

	static void printPattern(int size) {
		//int counter = 0;
		for(int i =1,p=5; i<=size; i++, p--) {
			for(int j=1; j<=i; j++) {
				System.out.print(p);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int s = 5;
		printPattern(s);

	}

}
