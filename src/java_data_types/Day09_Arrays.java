package java_data_types;

public class Day09_Arrays {

	public static void main(String[] args) {
		
		
		int a; // declare the variable
		a=50; // Initialize the variable
		
	// 	int[] rollNumber; // declare an array variable
	//	rollNumber = new int[5];
		
		int[] _rollNumber = new int[5];
		_rollNumber[0] = 500;
		_rollNumber[1] = 400;
		_rollNumber[2] = 300;
		_rollNumber[3] = 200;
		_rollNumber[4] = 100;
		
		System.out.println(_rollNumber[3]);
		
		String[] _rollName = new String [5];
		_rollName[0] = "George";
		_rollName[1] = "Jose";
		_rollName[2] = "Peter";
		_rollName[3] = "John";
		_rollName[4] = "Larry";
		
		System.out.println(_rollName[2]);
		
		int[] rollNum = { 100,200,300,400,500,255,2220,221,85,4,5,445};
		System.out.println(rollNum[3]);
		
		String[] rollStudent = {"George","Jose","Peter","John","Larry","Terry"};
		System.out.println(rollStudent[4]);	
		
		System.out.println(rollNum.length);
		System.out.println(rollStudent.length);
		
		for(int i=0;i<rollNum.length;i++) {
			System.out.println(rollNum[i]);
		}
		
		for(int aa=0; aa<rollStudent.length;aa++) {
			System.out.println(rollStudent[aa]);
		}
	}

}
