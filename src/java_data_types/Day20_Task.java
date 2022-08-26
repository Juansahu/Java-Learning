package java_data_types;

abstract class shirts {
	abstract void material();
	abstract void color();
	
}
abstract class jackets extends shirts {
	void material() {
		System.out.println("this is a cotttom material" );
	}
	void color() {
		System.out.println("this color is black");
	}
	abstract void size();
	abstract void price();
}

class clothes extends jackets{

	void size() {
	System.out.println("this size is medium");	
	}
	void price() {
		System.out.println("this price is 19");	
	}	
}
public class Day20_Task {

	public static void main(String[] args) {
		clothes a = new clothes();
		a.material();
		a.color();
		a.size();
		a.price();
	}

}
