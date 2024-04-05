package for_3;

public class Task5 {
	public static void main(String[]args) {
		String  w ="this is my name and This is my home" ;
		String[] a = w.split(" ");
		
		
		for(int i=0;i<a.length;i++) {
			int o = 0;
			int count = 0;;
			for(int j=i+1; j<a.length;j++) {
				if(a[i].equals(a[j])) {
					count = count+1;
					o = o+1;
					a[j]="$";
				}}
				if((count>0)&&(a[i]!="$")) {
					o=o+1;
				}
			}
		System.out.println(o);
		}
	
		
	}


