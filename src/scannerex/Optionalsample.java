package scannerex;

import java.util.Optional;

public class Optionalsample {
	public static void main(String[] args) {
		
		String[] a = {null,"try","zig","opl",null};
		for(int i=0;i<a.length;i++) {
		
		Optional<String> k =  Optional.ofNullable(a[i]);
		
		
//		if(k.isEmpty()) {
//			System.out.println("hi");
//		}
//		else {
//			System.out.println("go");
//		}
		System.out.println(k.orElse("jjjjjj"));}}}
		
		
		
	


