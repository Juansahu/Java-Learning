package java_data_types;

import java.util.Scanner;

public class Day07_looptask {

	public static void main(String[] args) {
		
		Scanner monthInput = new Scanner(System.in);
		for (int i=0; i<=3;i++) {
			System.out.println("Enter the month you were born in :");
			String monthName = monthInput.next();
			if (monthName.equalsIgnoreCase("january") || monthName.equalsIgnoreCase("february") || monthName.equalsIgnoreCase("march")) {
				System.out.println("winter");
			} else if (monthName.equalsIgnoreCase("april") || monthName.equalsIgnoreCase("may") || monthName.equalsIgnoreCase("june")) {
				System.out.println("spring");
			} else if (monthName.equalsIgnoreCase("july") || monthName.equalsIgnoreCase("august") || monthName.equalsIgnoreCase("september")) {
				System.out.println("summer");
			} else if (monthName.equalsIgnoreCase("ocotber") || monthName.equalsIgnoreCase("november") || monthName.equalsIgnoreCase("december")) {
				System.out.println("fall");
			} else {
				System.out.println("provide the valid month");
			}
			
		} 
		

	}

}
