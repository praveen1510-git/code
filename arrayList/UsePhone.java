package arrayList;
import java.util.*;
public class UsePhone {
	public static void main(String[] args) {
		
		Phone a1 = new Phone("samsung","black",25000,9.5f,2000);
		
		Phone a2 = new Phone("nokia","black",30000,9f,2000);
		Phone a3 = new Phone("redmi","black",25000,8.5f,2001);
		Phone a4 = new Phone("oppo","white",45000,8f,2022);
		Phone a5 = new Phone("vivo","green",30000,9.2f,2021);
		
		ArrayList <Phone> a = new ArrayList<>();
		a.add(a1);
		a.add(a2);
		a.add(a3);
		a.add(a4);
		a.add(a5);
		
		//for(int i =0; i<a.size();i++) {
			//System.out.println(a.get(i));
		//}
		//for(Phone z :a) {
			//if(z.getPrice()>30000&&z.getPrice()<50000) {
				//System.out.println(z);
			//}
		
	//	ArrayList <Phone> t = new ArrayList<>();
		
		////a.forEach(z ->{
			
			//if(z.getEditionYear()>2004) {
				//t.add(z);
			//}
				
			
		///}) ;
//		for(int i = 0; i<t.size();i++)
//		System.out.println(t.get(i));
//		}
//		

//		a.forEach(z ->{
//			if(z.getRating()>8) {
//				z.setPrice(z.getPrice()+(z.getPrice()*25)/100);
//			}
//		});
//		for(int i = 0;i<a.size();i++) {
//			System.out.println(a.get(i));
//		}
//		
		for(int i = 0;i<a.size();i++) {
			if(a.get(i).getRating()>8) {
				a.get(i).setPrice(((a.get(i).getPrice()*25)/100)+a.get(i).getPrice());
			}
			System.out.println(a.get(i));
		}
//		for(int i = 0;i<a.size();i++) {
//			System.out.println(a.get(i));
//		}
	}}

