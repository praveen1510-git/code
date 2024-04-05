package staticKeyword;

public class UseEmployee {
	public static void main(String[] args) {
		
		Employee e = (a)->{ if(a>5) {
			return "senior";
		}
		else {
			return "junior";
		}
		
	};
	Employee g = (a)->{ if(a>5) {
		return "funny";
	}
	else {
		return "hi";
	}
	
};
	System.out.println(e.exp(6));
	System.out.println(Employee.salary(25000));
	System.out.println(e.id(1456));
	System.out.println(g.exp(8));
	

}
}