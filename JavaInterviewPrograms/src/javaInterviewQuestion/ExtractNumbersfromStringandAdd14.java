package javaInterviewQuestion;

public class ExtractNumbersfromStringandAdd14 {

	public static void main(String[] args) {
		// Extract Numbers from String and Add them
		
		String input= "agniprasanth123";
		int total=0;
		int length = input.length();	
		for (int i = 0; i <length; i++) {
			char character = input.charAt(i);
			if(Character.isDigit(character)) {
				total =total+ Character.getNumericValue(character);
			}
		}
		System.out.println(total);
		
	}
}
