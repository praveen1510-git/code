package staticKeyword;

public class Chair implements Furniture{
	public String brand(String k) {
		return k;
	}

	public  String iswood(boolean k) {
		if(k==true) {
			return "yes wood";
		}
		else {
			return "no carbonfibre";
		}
	}


}
