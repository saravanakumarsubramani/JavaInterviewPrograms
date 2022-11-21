package javaInterviewQuestion;

import java.util.Scanner;

public class FindByPosition9 {

	public static void main(String[] args) {
		// Example for Find By Position

		//ASCII -> A->65, a->97

		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your character:");
		char givenchar = scanner.next().charAt(0);
		givenchar = Character.toLowerCase(givenchar);
		int asciivalue=(int)givenchar;
		System.out.println(asciivalue);
		int position= asciivalue-96;
		System.out.println(position);
	}

}
