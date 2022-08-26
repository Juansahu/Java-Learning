package java_data_types;

public class Day23_Strings {

	public static void main(String[] args) {
		
		String topic = new String ("what is the topic we are learning today ?");
		int len = topic.length();
		System.out.println(len);
		String name = "JOHN";
		String lastname = "KING";
		System.out.println("this will print the length of name variable : "+name.length());
		System.out.println("this will print the name variable : " +name); //JOHN
		String lowerName = name.toLowerCase();
		System.out.println("this will convert the name variable to lowercase : "+lowerName); //john
		System.out.println(topic.toUpperCase());
		System.out.println("Using equalsignorecase : "+name.equalsIgnoreCase(lastname));
		System.out.println("Using equals method : "+name.equals(lastname));
		//compare
		System.out.println(name.compareTo(lastname));
		System.out.println(name.compareToIgnoreCase(lastname));
		
		// if the value is 0 we print the value is 0 if the value is negative print the value is negative
		// if the value is positive print the value is positive
		//task 
		//fname, lname
		
		String Fname = "JUAN";
		String Lname = "FLORES";
		
		int aa = name.compareTo(Fname);
		if (aa == 0) {
			System.out.println("the value is 0");
			
		}else if (aa > 0) {
			System.out.println("the value is negative");
		}else  (aa < 0) {
			System.out.println("the value is positive");
			
		}
	}

}
