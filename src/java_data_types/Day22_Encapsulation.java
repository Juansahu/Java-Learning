package java_data_types;

public class Day22_Encapsulation {

	public static void main(String[] args) {
		
		Day22_Employee_Information a = new Day22_Employee_Information();
		a.setName("Juan");
		System.out.println(a.getName());
		
		a.setSsn(111111111);
		System.out.println(a.getSsn());
		
		a.setGraduated(true);
		System.out.println(a.getGraduated());
		
		a.setSurname("Flores");
		System.out.println(a.getSurname());
	
		a.setGrades("A");
		System.out.println(a.getGrades());
		
		a.setAge(25);
		System.out.println(a.getAge());
				

	}

}
