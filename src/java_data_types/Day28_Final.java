package java_data_types;

final class example1{
	final int a = 10;
	final String api = "AJDFJGJFJDJ458848";
	
	final void methodone() {
		System.out.println("this is methodOne from example1 class"+a );
	}
}

/*
 *if you have a final keyword with the class you cannot perform inheritance
 *if you have a final keyword with the variable you cannot re-initialize a new value 
 *if you have a final keyword with the method you cannot perform overriding
 */

class example4{
	
}

public class Day28_Final {

	public static void main(String[] args) {
		example1 ex = new example1();
		ex.methodone();
		
	}

}
