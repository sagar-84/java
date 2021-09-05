package numberPatterns;

public class SingleNumber {

	static void printPattern(int size) {
		for(int i=1; i<=size; i++) {
			int p =1;
			for(int j=1; j<=i; j++) {
				System.out.print("- ");
			}
			for(int j=i; j<=size; j++) {
				System.out.print(p++ +" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int s = 5;
		printPattern(s);

	}

}
