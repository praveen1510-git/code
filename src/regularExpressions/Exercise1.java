package regularExpressions;

import java.util.regex.*;


public class Exercise1 {
	public static void main(String[] args) {
		
	
	
	String a = "tiger";
	String b = "TIger";
	Pattern k = Pattern.compile(a);
	// or use below one 
	//Pattern k = Pattern.compile(a,Pattern.CASE_INSENSITIVE);
	Matcher j = k.matcher(b);
	
	boolean m = j.find();
	System.out.println(m);
	

}}
