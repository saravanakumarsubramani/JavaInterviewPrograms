package javaInterviewQuestion;

import java.util.Scanner;

public class NumberReverse3 {

	public static void main(String[] args) {
		// example for reverse number

		int givenumber=0;

		int reversedNumber=0;
		//scanner
		
		System.out.println("enter you number:");
		
		Scanner scanner=new Scanner(System.in);
		 givenumber = scanner.nextInt();
while(givenumber!=0) {
		reversedNumber=reversedNumber*10;
		reversedNumber=reversedNumber+givenumber%10;
		givenumber=givenumber/10;
		}
System.out.println(reversedNumber);
	}
}
