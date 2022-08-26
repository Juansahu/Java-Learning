package java_data_types;

import java.util.Scanner;

public class Day10_Arrays_task {

	public static void main(String[] args) {

		// Write a program which asks user that how many values they want to do a sum
		// for?
		// lets say user enters 5
		// it should ask user to enter those 5 values
		// once the user enters those 5 values it should print the sum of those 5 values
		// Scanner, One dimensional Array, for loop
		int sum = 0; 
	System.out.println("How many values do you want to enter?");
	Scanner getInput = new Scanner(System.in);
	int n = getInput.nextInt();
	int c[]	= new int[n];
	System.out.println("enter all values");
	for (int i=0; i<n; i++) {
		c [i]=	getInput.nextInt();

		sum = sum+ c[i];
	}
		System.out.println("the sum is: "+  sum);
	
	
		
		
		
		
		
		
		
		
		
		
//		int sum = 0;
//		System.out.println("How many values would you like to enter? ");
//		Scanner values = new Scanner(System.in);
//		int n = values.nextInt();
//		int a[] = new int[n];
//		System.out.println("Enter those values now");
//
//		// use the loop
//		for (int i = 0; i < n; i++) {
//			a[i] = values.nextInt();
//			sum = sum + a[i];
//		}
//		System.out.println("The sum of all values is:" + sum);
		
	}

}
