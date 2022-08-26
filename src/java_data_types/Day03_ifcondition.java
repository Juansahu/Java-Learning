package java_data_types;

public class Day03_ifcondition {

	public static void main(String[] args) {
		// true statement 
		
		if (2==2) {
			System.out.println("the value is 2");
			}
		System.out.println("After the if statement");
		// false statement
		if (2==3) {
			System.out.println("the value is not 2");
		}
		
		int a =31;
		if (a==30) {
			System.out.println("the value of a is 30");
		} else {
			System.out.println("the value of a is not 30");
			
			System.out.println(("*******compare 2double values*********"));
		}
		double b =31.565544545;
		double c =32.455584456;
		if (b==32.36) {
			System.out.println("both double value are same");
		} else {
			System.out.println("both double value of are not the same");
		}
		int d =15;
		if (d> 0) {
			System.out.println("value of is positive");
		} else {
			System.out.println("value of is negative");
		}
		int e =-9;
		if (e>0) {
			System.out.println("value is positive");
		} else {
			System.out.println("value is negative");
		}
		
		
		char value = 'b';
		if (value == 'a') {
			System.out.println("the value is a");
		} else if (value =='b') {
		System.out.println("the value is b");
		} else if (value =='c') {
			System.out.println("the value is c");
		} else if (value =='d') {
			System.out.println("the value is d");
		} else {
			System.out.println("the value is something else");
		}
		
		
		String weekday = "tuesday";
		if (weekday =="monday") {
			System.out.println("the day is monday");
		} else if (weekday == "tuesday") {
			System.out.println("the day is tuesday");
		} else if (weekday == "wednesday") {
			System.out.println("the day is wednesday");
		} else if (weekday == "thurday") {
			System.out.println("the day is thursday");
		} else if (weekday == "friday") {
			System.out.println("the day is friday");
		} else if (weekday == "saturday") {
			System.out.println("the day is saturday");
		} else if (weekday == "sunday") {
			System.out.println("the day is sunday");
		} else {
			System.out.println("you have enterred an invalid day of the week");
		}
		
		String month = "june";
		if (month == "january") {
			System.out.println("the month is january");
		} else if (month == "february") {
			System.out.println("the month is february");
		} else if (month == "march ") {
			System.out.println("the month is march");
		} else if (month == "april") {
			System.out.println("the month is april");
		} else if  (month =="may") {
			System.out.println("the month is may");
		} else if (month == "june") {
			System.out.println("the month is june");
		} else if (month == "july") {
			System.out.println("the month is july");
		} else if (month == "august") {
			System.out.println("the month is august");
		} else if (month == "september") {
			System.out.println("the month is september");
		} else if (month == "october") {
			System.out.println("the month is october");
		} else if (month == "november") {
			System.out.println("the month is november");
		} else if (month == "december") {
			System.out.println("the month is december");
		} else {
			System.out.println("you have enterred an invalid month");
		}
	}
	}



