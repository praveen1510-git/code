package staticKeyword;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseTask {
	public static void main(String[] args) {
		
		List<String> kk = Arrays.asList("tree","five","try","tenth","give","dry","fry","feeeeeee");
		
		Task g = (s)->{
			      List<String> hh = s.stream().filter(x->(x.contains("a"))||(x.contains("e"))||(x.contains("i"))||(x.contains("o"))||(x.contains("u"))).collect(Collectors.toList()); return hh;
			    	  
			      
		};
		
		System.out.println(g.findvowel(kk));
	}

}
