package java_data_types;

import java.util.Scanner;

public class Day07_Loops {

	public static void main(String[] args) {
		System.out.println("Before the loop");
		for(int i=1; i <= 10;i++) {
			System.out.println(i);	
	}
		for (int i = 10; i >=0; i--) {
			System.out.println(i);
		}
		System.out.println("After the loop");
  
	
	for(int i= 0; i<=2; i++ ) {
		Scanner month = new Scanner(System.in);
		System.out.println("What month were you born in : ?");
		String monthValue = month.next();
		
		switch (monthValue) {
			case "january" :
				System.out.println("You were born in winter ");	
				break;
			case "february" :
				System.out.println("You were born in winter ");	
				break;
			case "march" :
				System.out.println("You were born in spring ");	
				break;
			case "april" :
				System.out.println("You were born in spring ");	
				break;
			case "may" :
				System.out.println("You were born in spring ");	
				break;
			case "june" :
				System.out.println("You were born in summer ");	
				break;
			case "july" :
				System.out.println("You were born in summer ");	
				break;
			case "august" :
				System.out.println("You were born in summer ");	
				break;
			case "september" :
				System.out.println("You were born in fall " +monthValue);	
				break;
			case "october" :
				System.out.println("You were born in fall " +monthValue);	
				break;
			case "november" :
				System.out.println("You were born in fall " +monthValue);	
				break;
			case "december" :
				System.out.println("You were born in winter " +monthValue);	
				break;
		default:
			System.out.println("invalid month");
		month.close();
		}
	
}
}
}
