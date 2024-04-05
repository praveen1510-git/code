package staticKeyword;

public interface Furniture {
	
	public String brand(String k);
	
	public static int cost(int l) {
		return l;
	}
	public static String review(float  k) {
		if(k>8.5) {
			return "good";
		}
		else {
			return "average";
		}
	}
	
	public default String iswood(boolean k) {
		if(k==true) {
			return "yes wood";
		}
		else {
			return "no steel";
		}
	}
	

}
