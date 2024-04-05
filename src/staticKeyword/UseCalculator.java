package staticKeyword;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator a = (c,d)-> c+d;
		Calculator b = (h,d)-> h*d;
		Calculator c = (m1,m2)-> { return m1*m2;};
		Calculator j1 = (m4,m5)-> m4-m5;
		Calculator j2 = (m6,m7)-> m6%m7;
		
	    //Calculator kk =  new Calculator();
		
		
		System.out.println(a.math(2, 50));
		System.out.println(b.math(5, 2));
		System.out.println(c.math(5, 55));
		System.out.println(j1.math(2, 50));
		System.out.println(j2.math(2, 5));
		
		
		
		
	}

}
