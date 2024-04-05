package staticKeyword;

public class Neurologist implements Doctor {
	
public String hospitalname(String k) {
	return k;
}
	
	public int salary(int o) {
		return o;
	}
	public  String  review(float k) {
		if((k>8)&&(k<=10)) {
			return  "good";
		}
		else {
			return "average";
		}
	}
	
	
	

}
