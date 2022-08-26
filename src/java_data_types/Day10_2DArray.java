package java_data_types;

public class Day10_2DArray {

	public static void main(String[] args) {
		
		String[][] countries = new String[2][2];
		countries[0][0] = "USA";
		countries[0][1] = "Canada";
		countries[1][0] = "Switzerland";
		countries[1][1] = "France";
		
		System.out.println(countries[1][1]);
		System.out.println(countries[1][0]);
		
		int[][] numbers = new int [2][2];
		numbers[0][0] = 20;
		numbers[0][1] = 30;
		numbers[1][0] = 40;
		numbers[1][1] = 50;
		
		System.out.println(numbers[0][0]);
		System.out.println(numbers[1][0]);
		
		String [][]_countries = {{"USA","Canada"}, {"France","Switzerland"},{"Germany","England"}};
		System.out.println(_countries[1][1]);
		System.out.println(_countries[2][1]);
		
		System.out.println("************Rows and Colums exercise**************");
		
		System.out.println(_countries.length);
		System.out.println(_countries[0].length);
		
		for(int rows=0; rows < _countries.length; rows++) {
			for(int column = 0; column < _countries[rows].length; column++) {
				System.out.println(_countries[rows][column]);
			}
		}
		
		
		
		
	}

}
