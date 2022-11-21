package javaInterviewQuestion;

import java.util.Iterator;

public class Find_NumberofVowels13 {

	public static void main(String[] args) {
		//  Find Number of Vowels in given string

		String input="saravankumar saravanakumar";
		int vowelscount=0;
		 input = input.toLowerCase();
		 int length = input.length();
		 for (int i = 0; i <length; i++) {
			 
			 if(input.charAt(i)=='a'|| input.charAt(i)=='e'||input.charAt(i)=='i'||
					 input.charAt(i)=='o'||input.charAt(i)=='u') {
			 vowelscount++;
		}
	}
	System.out.println("your name is"+ vowelscount + "vowels");

	}

}
