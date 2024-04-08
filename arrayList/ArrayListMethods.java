package arrayList;
import java.util.*;

public class ArrayListMethods {
	public static void main(String[] args) {
		
		
		ArrayList <Integer> nums = new ArrayList<>();
		
		nums.add(24);
		nums.add(6);
		nums.add(3);
		nums.add(56);
		nums.add(23);
		//System.out.println(nums);
		//nums.add(null);
		
	    for(int i = 0; i<nums.size();i++) {
	    	if(nums.get(i)%2==0) {
	    		//System.out.println(nums.get(i));
	    	}
	    }
	    for(Integer k :nums) {
	    	if(k%2!=0) {
	    		//System.out.println(k);
	    	}
	    }
	   // nums.forEach(x->System.out.println(x));
	    nums.forEach(dd -> {
	    	if(dd%2==0) {
	    		System.out.println(dd);
	    	}
	    });
		
		
		
	   // nums.set(2, 1000);
	    //nums.remove(1);
	   // System.out.println(nums.size());
	    
	    Integer aa = nums.get(2);
	    
	    		
		
	   // System.out.println(aa);
	    for(int i =0;i<nums.size();i++) {
	    //	System.out.print(nums.get(i)+" ");
	    }
	   // System.out.println("");
	    for(Integer d : nums) {
	    //	System.out.print(d+" ");
	    }
	    
	    
	}

}
