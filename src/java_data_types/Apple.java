package java_data_types;

public class Apple extends Phone {

	public static void main(String[] args) {
		Apple mob1 = new Apple();
		mob1.imei = 123456;
		mob1.make = "Apple";
		mob1.model = "iphone 13";
		mob1.color = "Red";
		mob1.memory = 64;
		mob1.camera = "20";

		mob1.makecalls();

	}

}
