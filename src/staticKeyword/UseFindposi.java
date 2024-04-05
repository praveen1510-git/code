package staticKeyword;

public class UseFindposi {
	public static void main(String[] args) {
		
		FindPositive a = (b)->{
			     for(int i =0;i<b.length;i++) {
			    	 if(b[i]>0) {
			    		 System.out.println(b[i]);
			    	 }
			     }
		};
		
		int[] kk = {20,-12,25,-30,65,85,-36};
		
		a.positive(kk);
	}

}
