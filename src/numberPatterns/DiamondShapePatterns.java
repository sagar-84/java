package numberPatterns;

public class DiamondShapePatterns {
	static void printPattern(int size) {
		//int  p=1;
		for(int i=1, p=0; i<=size; i++, p+=1) {
			for(int j=i; j<size; j++) {
				System.out.print("  ");
			}
			for(int k=1; k<i; k++) {
				System.out.print(" "+p);
			}
			for(int k=1; k<=i; k++) {
				System.out.print(" "+p);
			}
			System.out.println();
		}
		for(int i=1, p=3; i<=size; i++, p--) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<size-i; j++) {
				System.out.print(" "+p);
			}
			for(int j=1; j<=size-i; j++) {
				System.out.print(" "+p);
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		int s = 5;
		printPattern(s);
	}

}
