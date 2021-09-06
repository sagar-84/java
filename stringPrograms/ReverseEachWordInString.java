package stringPrograms;

public class ReverseEachWordInString {
	public static String reverseWord(String str){  
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	} 
	public static void main(String[] args) {  
	    System.out.println(reverseWord("my name is khan"));  
	    System.out.println(reverseWord("I am sonoo jaiswal"));    
	    }  
	
}
