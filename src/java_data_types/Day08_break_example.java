package java_data_types;

public class Day08_break_example {

	public static void main(String[] args) {
		
		int a = 1;
		do {
			System.out.println("Hello");
			if(a==14) {
				System.out.println("the value of a is 14");
				break;
			}
			a++;
		} while(a <= 15);

	}

}
