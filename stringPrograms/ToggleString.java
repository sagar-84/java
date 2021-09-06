package stringPrograms;

public class ToggleString {
	public static String toggle(String str){  
	    String words[]=str.split("\\s");  
	    String toggle="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        toggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
	    }  
	    return toggle.trim();  
	}
	public static void main(String[] args) {  
	    System.out.println(toggle("my name is khan"));  
	    System.out.println(toggle("I am sonoo jaiswal"));     
	  }  
	
}
