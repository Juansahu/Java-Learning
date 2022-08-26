package java_data_types;

public class Day04_NestedIf {

public static void main(String[] args) {
	
	// VP 200000 Sr/Jr, IT_PROG 120000, ANALYST 80000
	
	String title = "Tester";
	String role = "junior";
	
	if (title =="VP") {
		System.out.println("Vice President");
		if (role == "junior") {
			System.out.println("salary is $200,000");
		} else if (role == "senior") {
			System.out.println("salary is $250,000");
		} else {
			System.out.println("the role does not exist");
		}	
	}
	else if (title == "IT_PROG") {
		System.out.println("IT Programmer");
		if (role =="junior") {
			System.out.println("salary is $120,000");
		} else if (role == "senior") {
			System.out.println("salary is $170,000");
		} else {
			System.out.println("the role does not exist");
		}
	}
	else if (title == "ANALYST") {
		System.out.println("Analyst Prog");
		if (role == "junior") {
			System.out.println("salary is $80,000");
		} else if (role == "senior") {
			System.out.println("salary is $120,000");
		} else { 
			System.out.println(" the role does not exist");
		}
	}
	else if (title == "Tester") {
		System.out.println("tester Analyst");
		if (role == "junior") {
			System.out.println("salary is $100,000");
		} else if (role == "senior") {
			System.out.println("salary is $120,000");
		} else {
			System.out.println("the role does not exist");
		}
	}
	else {
		System.out.println("the role does not exist");
	}

	String job = "mechanic";
	String   = "j";
}
}


