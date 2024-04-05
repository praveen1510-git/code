package staticKeyword;

public interface Electronics {
	public default String  ison(boolean k) {
	 if(k==true) {
		 return "product is working";
	 }
	 else {
		 return "product is not working";
	 }
	}
	public int resalevalue(int price);

}
