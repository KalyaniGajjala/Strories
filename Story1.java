package assignment;
import java.util.HashMap;

public class Story1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="If we write a program and compile it, then we can run the program to get output.";  
		System.out.println(ColourAdder(split(str)));

	}
	public static String[] split(String str) {
		String[] words=str.split("\\s+");
		
		return words;  
	}
	public static String ColourAdder(String[] str) {
		 StringBuilder builder = new StringBuilder();
		 for(String s:str){  
			 String c=Checker(s);
				if( c!= null)  {
					
					
					builder.append(c);
					if(s.endsWith(",")||s.endsWith(".")) {
						builder.append(s.substring(0, s.length()-1));
						builder.append(c);
						builder.append(s.charAt(s.length()-1));
					}else {
					builder.append(s);
					builder.append(c);
					}
					builder.append(" ");
					
					
				}else {
					builder.append(s);
					if(!(s.contains(",")||s.contains("."))) {
						builder.append(" ");
					}
				}
				
				}
		 String singleString = builder.toString();
		
		return singleString;
		
	}
	public static String Checker(String str) {
		 HashMap<String, String> hm = new HashMap<String, String>();
		    hm.put("as", "[blue]");
	        hm.put("if", "[blue]");
	        hm.put("and", "[blue]");
	        hm.put("then", "[blue]");
	        hm.put("when", "[blue]");
	        
		String str1F[]= {"as","if","and","then","when" };
		if(str.endsWith(",")||str.endsWith(".")) {
			str=str.substring(0, str.length()-1);
			
		}
		return hm.get(str.toLowerCase());
		
		
	}

}
