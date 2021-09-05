package com.mycode;

import java.util.Scanner;

public class Palindrome {
//	public static void main(String args[])  
//	   { 
//			int num =252;
//			int temp = num; //252
//			int reminder;
//			int rev = 0; // 0
//
//		    while(temp != 0) {
//		    	reminder = temp%10; //getting that reminder -> 252%10 -> 2, 25%10 -> 5, 2%10 -> 2
//		    	rev = (rev*10) +reminder; // (0*10) + 2 -> 2, (2*10) + 5 -> 25, (25*10) + 2 -> 252
//		    	temp = temp/10; // 252/10 -> 25, 25/10 -> 2, 2/10 -> 0
//		    }
//		    if(num==rev)
//		    	System.out.println("Palindrome");
//		    else
//		    	System.out.println("Not Palindrome");
//		  
//	   }  
	public static void main(String[] args) {
		String original, reverse = "";
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter String or Number:\n");
			original = sc.nextLine();
		}
		int lenght = original.length();
		for(int i = lenght -1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
}
