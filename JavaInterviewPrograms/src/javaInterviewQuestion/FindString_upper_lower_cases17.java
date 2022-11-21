package javaInterviewQuestion;

import java.util.Scanner;

public class FindString_upper_lower_cases17 {

	public static void main(String[] args) {
		// Find String_upper_lower_cases

	//	String input="agni PraSANTH";
		
		String input2;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string:");
		 input2 = scanner.nextLine();
		int upper=0;
		int lower=0;
		//System.out.println(input.length());
		
		for (int i = 0; i < input2.length(); i++) {
			char charAt = input2.charAt(i);
			if(charAt>='A'&&charAt<='Z') {
				upper++;
			}else if(charAt>='a'&&charAt<='z') {
				lower++;
			}
		}
			System.out.println("lower case is"+lower);
			System.out.println("upper case is"+upper);
	}

}
