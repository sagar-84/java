package patternsDesign;

public class DecreasingTrianglePattern {
	static void printPattern(int size) {
		for(int i=1; i<=size; i++) {
			for(int j=i; j<=size; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		int s = 5;
		printPattern(s);
	}

}
