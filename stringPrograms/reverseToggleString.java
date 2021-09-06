package stringPrograms;

public class reverseToggleString {
	public static String reverseToggle(String str){  
	    String words[]=str.split("\\s");  
	    String reverseToggle="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        String first=sb.substring(0,1);  
	        String afterfirst=sb.substring(1);  
	        reverseToggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
	    }  
	    return reverseToggle.trim();  
	} 
	public static void main(String[] args) {  
	    System.out.println(reverseToggle("my name is khan"));  
	    System.out.println(reverseToggle("I am sonoo jaiswal"));      
	    }  
	
}
