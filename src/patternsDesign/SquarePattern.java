package patternsDesign;

public class SquarePattern {
	
	static void printSquare(int size) {
		
		//outer loop determines rows
		for(int i=1; i<=size; i++) {
			//inner loop determines column 
			for(int j=1; j<=size; j++) {
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
