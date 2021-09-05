package patternsDesign;

public class HillPattern {
	
	static void printPattern(int size) {
		for(int i=1; i<=size; i++) {
			
			for(int j=i; j<=size; j++) {
				System.out.print("  ");
			}
			//for(int k=1; k<=i; k++)
			for(int k=1; k<i; k++) {
				System.out.print("* ");
			}
			
			for(int m=1; m<=i; m++) {
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
