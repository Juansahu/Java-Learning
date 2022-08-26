package java_data_types;

import java.util.Scanner;

public class Day07_loop_task {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		for (int i = 100; i >=1; i--) {
			System.out.println(i);
			}
		
		for (int i = 20; i <=50; i++) {
			if ( i%2 == 0) {
				System.out.println("the number is even: "+i);
			}
			else if ( i%2 == 1 ) {
			System.out.println("the number is odd: "+i);
			}
			
		}
		
		
	}
	}

