package patternsDesign;

public class RightSIdedTriangle {
	static void printSquare(int size) {
		
		//outer loop determines rows
		for(int i=1; i<=size; i++) {
			//inner loop determines column 
			for(int j=i; j<=size; j++) {
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
		System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		int n = 5;
		printSquare(n);
	}

}
