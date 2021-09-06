package stringPrograms;

public class ReverseString {
	
	// Using String Builder
	public static String reverseString(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    return sb.toString();  
	} 
	
	public static String reverseString1(String str){  
	    char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    return rev;  
	}  
	
	public static void main(String[] args) {  
	    System.out.println(reverseString("my name is khan"));  
	    System.out.println(reverseString1("I am sonoo jaiswal"));      
	    }  

}
