package javaInterviewQuestion;

public class LengthofString5 {

	public static void main(String[] args) {
		// 1.example of length of string
		
		String given="saravanakumar";
		System.out.println(given.length());
//2.without using length 
		char[] charArray = given.toCharArray();
		
		int length=0;
		for (char c : charArray) {
			length++;
		}
		System.out.println(length);
	}

}
