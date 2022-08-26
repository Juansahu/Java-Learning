package java_data_types;

public class Day15_LocalVariables {

	// here can declare Global variable, cant be static
	String day = "Monday";
	
	public static void main(String[] args) {
		
		int age= 10;
		String name = "John";
		float temp = 45.88f;
		
		System.out.println(age);
		System.out.println(name);
		System.out.println(temp);
		
		Day15_LocalVariables a = new Day15_LocalVariables();
		a.possible();
		
		if (true) {
			//local variable
			int b = 4;
			System.out.println(b);
		}
	}
	
	public static void possible() {
		String environment = "qa.codegator.us";
		String username = "test@gmail.com";
		String password = "Welcome1";
		
		System.out.println(environment);
		System.out.println(username);
		System.out.println(password);
	}
	

}
