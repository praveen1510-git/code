package staticKeyword;
@FunctionalInterface
public interface Employee {

	public String exp(int a);
	
	public static int salary(int a) {
		return a;
	}
	public default int id(int a) {
		return a;
	}
	
	
}
