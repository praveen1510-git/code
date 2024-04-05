package staticKeyword;

public class MyClass {
	
	public static int findmax(int[] a) {
		int max = a[0];
		for(int i =0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}

	public  int findmin(int[] a) {
		int max = a[0];
		for(int i =0;i<a.length;i++) {
			if(max>a[i]) {
				max=a[i];
			}
		}
		return max;
	}
	
}
