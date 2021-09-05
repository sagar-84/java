package numberPatterns;

public class OddEvenPattern {
	
	static void printPattern(int size) {
		for(int i=1; i<=size; i++) {
			for(int j=1; j<=i; j++) {
				if(i%2==0)
			  System.out.print("2");
				else
			  System.out.print("1");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int s = 5;
		printPattern(s);
	}

}
