package patternsDesign;

public class RightSidedTrianglePattern {
	static void printPattern(int size) {
		for(int i=1; i<=size; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for(int k=i; k<=size; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int s = 5;
		printPattern(s);
	}
}
