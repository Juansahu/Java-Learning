package java_data_types;

import java.util.Scanner;

public class Day06_Scanner {

	public static void main(String[] args) {
		// how to create an object 
		// classmate objectname = new classmate();
		Scanner takeInput = new Scanner(System.in);
		System.out.println("Enter the int value:");
		int val1 = takeInput.nextInt();
		System.out.println("the enterred value is : ");
		
		// nextBoolean (true, false)
		System.out.println("Is it raining outside :");
		boolean val2 = takeInput.nextBoolean();  // true or false
		System.out.println( "if it is true it is raining, if its false then its not raining:"+val2);
		
		// nextLine (String)
		System.out.println("Enter your name : ");
		String name = takeInput.next();
		System.out.println("the name you enterred is :"+ name);
		
		System.out.println("Enter your last name : ");
		String Last_name = takeInput.next();
		System.out.println("the last name enterred is :" + name);
		// nextFloat
		System.out.println("Enter the floating value : ");
		float temp = takeInput.nextFloat();
		System.out.println("the temp is :"+temp);
		
		System.out.println("Enter your age :");
		int age = takeInput.nextInt();
		
		
	}

}
