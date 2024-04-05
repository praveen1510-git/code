package staticKeyword;

public interface Car {
	
	public String brand(String k);
	public String model(String g);
	
	public static String fuelType(String p) {
		return p;
	}
	public static int topspeed(int h) {
		return h;
	}
		
	
	
	

}
