package java_data_types;

public class Day25_Task {

	public static void main(String[] args) {
//Create a method that will take 1 String sentence as a parameter. Inside your method write a code that should return a String without any spaces.
// create a method that will take 1 String as parameter (your String should be combination of letters, numbers and special characters).
//Inside your method write a logic that will calculate the number of alpha characters only and your method should return that number.
//You have a String a="Today is a good day. It is Thursday. We have a Java Class". How would you find out how many sentences are in that String? "\\."
		
		System.out.println(noSpaceSentence("Create a method that will take 1 String sentence as a parameter. Inside your method write a code that should return a String without any spaces.")); 
		System.out.println(returnNumberofcharacters("1234566789fgkbmtbkmkf@$$%^&&&&"));
		String a = "Today is a good day. It is Thursday. we have a jave class. how would find out how many sentences are in the string?";
		String[] sen = a.split("\\.");
		System.out.println(sen.length);
	}
	
	public static String noSpaceSentence(String sentence) {
	return	sentence.replaceAll(" ", "");
	}
	
	public static int returnNumberofcharacters(String words) {
		String specialCharacters = words.replaceAll("[A-Za-z0-9]", "");
		int specialCharacterCount = specialCharacters.length();
		return specialCharacterCount;
	}

}
