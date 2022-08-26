package java_data_types;

public class Day24_Task {

	public static void main(String[] args) {
	//	Task 1. Create a method that will take 1 parameter as a String. If the String has odd number of characters and has 3 or more characters,
	//	print the character in the middle of the String.
	//	Task 2. Create a method that will take 1 parameter as a String. If the String has even number of characters and has 5 or more characters,
	//	print the middle two characters of the String.
	//	Task 3. Create a method that will take 2 parameters as a String(actualValue, expectedValue). 
	//	Your method should return boolean value verifying whether given two strings are equal or not 
	taskTwo("abcdefgh");
	String name = new String ("Juancho");
	int name_length = name.length(); //7
	int a = name_length/2;
	System.out.println(a);
	
	System.out.println(name.substring(a, a+1));
	
	if (a >=3 || a % 2 ==1) {
		System.out.println("the string has and odd number : " + name.substring(a, a + 1));
	} else {
		System.out.println("the String has an even number");
	}
	
	public static void taskTwo(String word) {
		int worldLength = word.length();
		if (worldLength > 5) {
			if (worldLength % 2 == 0) {
				int center = worldLength / 2;
				System.out.println(word.substring(center -1, center + 1));
			}
		}
	}
	
	public static boolean taskThree(String valueOne, )






	

	
		
	}

	private static void taskTwo(String string) {
		// TODO Auto-generated method stub
		
	}

}
