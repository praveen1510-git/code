package for_3;

public class Task3 {
	public static void main(String[] args) {
		char[] a = "banana".toCharArray();
		
		
		for(int i =0;i<=a.length;i++) {
			int count =0;
			for(int j=i+1;j<=a.length;j++) {
				if(a[i]==a[j]) {
					count = count+1;
					a[j]='$';
					
				}}
				
			
			if(count==0&&a[i]!='$') {
				System.out.println(a[i]);
			}
		}
	}

}
