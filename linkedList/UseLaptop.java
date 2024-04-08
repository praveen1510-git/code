package linkedList;

import java.util.*;

public class UseLaptop {
public static void main(String[] args) {
	Laptop a1 = new Laptop("dell",30000,"black","window",12);
	Laptop a2 = new Laptop("acer",35000,"blue","window",8);
	Laptop a3 = new Laptop("lenova",40000,"black","window",12);
	Laptop a4 = new Laptop("samsung",30000,"white","window",14);
	Laptop a5 = new Laptop("hp",60000,"black","window",12);
	
	LinkedList <Laptop> a = new LinkedList <>();
	a.add(a1);
	a.add(a2);
	a.add(a3);
	a.add(a4);
	a.add(a5);
	a.add(null);
	a.add(null);
	a.add(a1);
	
	//a.remove(0);
//	
//	a.forEach(g -> {
//		if(g.getColor().equals("black")) {
//			System.out.println(g);
//		}
//	});
	
	System.out.println(a.size());
		
	
	System.out.println(a);
	
	
	
}
}
