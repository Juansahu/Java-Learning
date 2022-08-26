package java_data_types;

public class Day11_Methods {

	public static void main(String[] args) {
		sample();
		hello();
		sum();
		learning();
		add(5, 4);
		add(20, 50);
	}
	
	//user defined method without a parameter
	
	public static void sample() {
		System.out.println("Hello World");
	}
	
	public static void hello() {
		System.out.println("Hello today we are learning methods");
	}
	
	public static void sum() {
		int a = 5;
		int b = 10;
		System.out.println(a + b);
	}
	
	public static void learning() {
		System.out.println("Tomorrow alpacas need their shot");
		System.out.println("--------------------------------");
	}
	
	// user defined method with parameters
	public static void add(int a, int b) {
		System.out.println(a + b);
	}
	
}
