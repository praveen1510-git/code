package staticKeyword;

public class UseMax {
	public static void main(String[] args) {
		int[] hu = {12,52,45,85,63,20};
		MyClass aa = new MyClass();
		
		Max m = aa::findmin;
		
		Max n = MyClass::findmax;
		
		System.out.println(m.meth(hu));
		System.out.println(n.meth(hu));
	}

}
