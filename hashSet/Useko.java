package hashSet;

import java.util.HashSet;



public class Useko {
	public static void main(String[] args) {
		
		Laptop a1 = new Laptop("dell",30000,"black","window",12);
		Laptop a2 = new Laptop("acer",35000,"blue","window",8);
		Laptop a3 = new Laptop("lenova",40000,"black","window",12);
		Laptop a4 = new Laptop("samsung",30000,"white","window",14);
		Laptop a5 = new Laptop("hp",60000,"black","window",12);
		
		HashSet <Laptop> a = new HashSet <>();
		a.add(a1);
		a.add(a2);
		a.add(a3);
		a.add(a4);
		a.add(a5);
		a.add(a1);
		
		
		
		
//		a.get(0);
//		
//		a.remove(a1);
//		a.set(0,a2);
		a.add(null);
		a.add(null);
		System.out.println(a.size());
		
		
		
		
		
	}

}
