package staticKeyword;

public class UseChair {
	public static void main(String[] args) {
		
		Chair a = new Chair();
		System.out.println(a.brand("woodworld"));  
		System.out.println(Furniture.cost(2000));
		System.out.println(Furniture.review(7.8f));
		System.out.println(a.iswood(false));
		
		
		
		
	}

}
