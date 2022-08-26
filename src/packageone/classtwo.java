package packageone;

class ClassFour {
	public int a4 = 50;
	private int b4 = 80;
	private static void methodSix() {
		System.out.println("This is method 6");
	}
}

public class classtwo {
	public int a2 = 20;
	
	public static void main(String[] args) {
		Classone c1 = new Classone();
		c1.methodone();
		
		System.out.println(c1.a1);
		c1.methodSeven();
		System.out.println(c1.c1);
		//c2.methodFour(); this method is not accessible because it is private
		//System.out.println(c2.b1); this variable is not accessible because is private
	}
	public static void methodTwo() {
		System.out.println("This is method 2");
	}
	
	}

