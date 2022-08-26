package java_data_types;

import java.util.Scanner;

public class Day05_Scanner {
	public static void main(String[] args) {
		// create an object/ instace of the class
		
		// classname objectname = new classname();
		Scanner getInput = new Scanner(System.in);
		// getImput in the object of the Scanner class.
		
		System.out.println("Enter the first value");
		// scanner class has methods which takes the int value as input
		
		System.out.println("Enter the second value");
		int bb = getInput.nextInt();
		
		System.out.println("Enter the third value");
		int cc = getInput.nextInt();
		
		System.out.println("Enter the fourth value");
		int ee = getInput.nextInt();
		
		int dd = aa+bb+cc*ee;
		System.out.println("the total is :"+dd);
		
	}

}
