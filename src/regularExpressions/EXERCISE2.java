package regularExpressions;
import java.util.Arrays;
import java.util.regex.*;

public class EXERCISE2 {
	public static void main(String[] args) {
		Pattern a = Pattern.compile("[a-zA-Z]");
		Pattern m  = Pattern.compile("[0-9]");
		Pattern n = Pattern.compile("[a-d&&b-f]");
		
		Pattern k = Pattern.compile("\\b");
		String bb = "jfi mdj kfj ";
		String[] cc = bb.split("\\S");
		
	
		
		// above expression tells that any of the character that present in the range matches in the matcher
		Matcher b = k.matcher(" g");
		//System.out.println(cc[]);
		
		System.out.println(Arrays.toString(cc));
	}
	
}