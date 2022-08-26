package packageone;

import packagetwo.Classthree;

public class Classone {
	public int a1 = 10;
	private int b1 = 20;
	int c1 = 90;
	
	
	public static void main(String[] args) {
		Classone c1 = new Classone();
		c1.methodone();
		c1.methodFour();
		c1.methodSeven();
		System.out.println(c1.a1);
		
		 ClassFour c4 = new ClassFour();
		 System.out.println(c4.a4);
		//System.out.println(c4.a4); variable is not accessible because it is private
		
		Classthree c3 = new Classthree();
		c3.methodThree();
		System.out.println(c3.a3);
		//c3.methodfive(); // because the method is private
		//system.out.print(c3.b3); // because the variable is private
		//c3.methodEight(); // is not accessible because it is present in a different package
		//System.out.println(c3.c3); // this is not accessible because it is present 
	}
	static void methodSeven() {
		System.out.println("This is method Seven");
	}
	

	public static void methodone() {
		System.out.println("This is method 1.");
	}
	private static void methodFour() {
		System.out.println("This is method 4");
}
	
	
 
}
