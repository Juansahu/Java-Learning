package java_data_types;

public class Day22_Employee_Information {
	
	private String name;
	private int ssn;
	private boolean graduated;
	private String surname;
	private String grades;
	private int age;
	
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	

	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	public void setSurname(String surname) {
	this.surname = surname;
	}
		public String getSurname() {
		return surname;
		}
	
	public void setGraduated(boolean graduated) {
		this.graduated = graduated;
	}
		public boolean getGraduated() {
		return graduated;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
}
