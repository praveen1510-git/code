package staticKeyword;

public class UseKey {
	public static void main(String[] args) {
		
		String[] a = {"tree","try","fellow","valor"};
		
		Key kk = (b)->{
			String h = b[0];
			for(int i=0;i<b.length;i++) {
				if(h.length()>b[i].length()) {
					h=b[i];
				}
			}
			return h;
			
			
			
			
		};
		System.out.println(kk.findminlength(a));
		
		
	}

}
