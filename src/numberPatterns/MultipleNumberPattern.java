package numberPatterns;

public class MultipleNumberPattern {
	static void printPattern(int size) {
		//int count = 0;
		for(int i=1, p=0; i<=size; i++, p=p+2) {
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
