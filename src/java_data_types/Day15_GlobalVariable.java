package java_data_types;

public class Day15_GlobalVariable {
	// Global Variable 
	String phone = "Iphone";
	String color = "black";
	static int memory = 32;

	public static void main(String[] args) {
		Day15_GlobalVariable johnPhone = new Day15_GlobalVariable();
		System.out.println(johnPhone.phone);
		System.out.println(johnPhone.color);
		System.out.println(johnPhone.memory); // 32
		
		Day15_GlobalVariable stevePhone =  new Day15_GlobalVariable();
		stevePhone.phone = "Iphone13";
		stevePhone.color = "Red";
		stevePhone.phone = "Iphone14";
		stevePhone.memory = 64;
		System.out.println(stevePhone.phone);
		System.out.println(stevePhone.color);
		System.out.println(stevePhone.memory); // 64
		
		
		System.out.println("*************Mike Phone***************");
		Day15_GlobalVariable mikePhone =  new Day15_GlobalVariable();
		System.out.println(mikePhone.phone); // default iphone 
		System.out.println(mikePhone.color); // default black
		System.out.println(mikePhone.memory); // lastest update 64
		
		Day15_GlobalVariable juanPhone = new Day15_GlobalVariable();
		juanPhone.phone = "iphone14";
		juanPhone.color = "Blue";
		System.out.println(juanPhone.phone);
		System.out.println(juanPhone.color);
		System.out.println(juanPhone.memory);
		Day15_GlobalVariable vinPhone = new Day15_GlobalVariable();
		vinPhone.possible();

	}
	
	public static void possible() {
		Day15_GlobalVariable vinPhone = new Day15_GlobalVariable();
		vinPhone.phone = "Iphone 12";
		vinPhone.color = "Grey";
		System.out.println(vinPhone.phone); // iphone
		System.out.println(vinPhone.color); // black
		System.out.println(vinPhone.memory); // 64
	}

}
