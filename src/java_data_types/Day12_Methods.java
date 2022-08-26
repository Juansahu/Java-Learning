package java_data_types;

public class Day12_Methods {

	public static void main(String[] args) {
		name();
		name2("John");
		name2("Ali");
		name2("Ken");
		
		name3("John", 25);
		name3("Mike", 35);
		name3("Steve", 28);
		
		System.out.println("************************************************");
		
		String a = day();
		System.out.println(a);
		
		String b = month(); 
		System.out.println(b);
		
		String value = topic(" void and non void method");
		System.out.println(value);
		
		System.out.println(" parameterized and non parameterized methods");
		
	}
	// non void method without parameter
	public static String day() {
		String todaysday = "tuesday";
		return todaysday;
	}
	public static String month( ) {
		return "August" ;
		
	}
	// non void method with parameters
	public static String topic (String a) {
		return "Today we are learning"+a;
		
	}
	
	// method without parameter
	public static void name() {
		System.out.println("My name is Juan Flores");
	}

	// method with parameter
	public static void name2(String a) {
		System.out.println("My name is " +a);
	}
	
	public static void name3(String name, int age) {
		System.out.println(name + " is " + age + " years old. ");
	}
	
}
