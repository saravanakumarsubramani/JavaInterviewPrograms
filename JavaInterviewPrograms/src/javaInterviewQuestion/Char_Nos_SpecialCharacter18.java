package javaInterviewQuestion;

public class Char_Nos_SpecialCharacter18 {

	public static void main(String[] args) {
		// Char_Nos_Special Character in the given string

		String input="vbs@123#";
		
		 int count=0;
		 
		 for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i))
					&&!Character.isLetter(input.charAt(i))
					&&!Character.isWhitespace(input.charAt(i))) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("no special character");
		}else {
			System.out.println("string  special character is " +count);
		}
		
		}
	}

