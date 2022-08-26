package java_data_types;
abstract class Shape {
	abstract int RectangleArea(int lenght, int width);
	abstract int SquareArea(int side);
	abstract float CircleArea(float radius);
}
 class Area extends Shape{
	int RectangleArea(int lenght, int width) {	
		return lenght*width;
	}
	int SquareArea(int side) {
		int square = side *4;
		return square;
	}
	float CircleArea(float radius) {
		return 2*3.14f*radius;
	}}
public class Day22_Task1 {
	public static void main(String[] args) {
		
		Area a = new Area();
		int b = a.RectangleArea(5, 2); 
		System.out.println("this is the area of rectangle: " +b);
		int c = a.SquareArea(7);
		System.out.println("this is the area of square: " +c);
		float d = a.CircleArea(6.5f);
		System.out.println("this is the area of circle: " +d);
	}

}
