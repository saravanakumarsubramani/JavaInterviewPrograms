package javaInterviewQuestion;

public class Remove_LeadingAndTrailSpaces11 {

	public static void main(String[] args) {
		// Remove_Leading And Trail Spaces
		
		//1.Using trim method
		String input=" Am saravanakumar ";
		System.out.println(input.trim());

		//2.Using strip method 
//System.out.println(input.stripLeading());
		
		//3.Regular Expressions
		
		//total spaces
		System.out.println(input.replaceAll("^[ \t]+|[ \t]+ $", ""));
		//leading spaces
		System.out.println(input.replaceAll("^[ \t]", ""));
		//Trailing spaces
		System.out.println(input.replaceAll("[ \t]+$" ,""));
	}

}
