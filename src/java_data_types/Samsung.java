package java_data_types;

public class Samsung extends Phone {

	public static void main(String[] args) {
		Samsung mob1 = new Samsung();
		mob1.imei = 34788665;
		mob1.make = "Samsung";
		mob1.model = "note";
		mob1.color = "black";
		mob1.memory = 128;
		mob1.camera = "12";

		mob1.makecalls();

	}

}
