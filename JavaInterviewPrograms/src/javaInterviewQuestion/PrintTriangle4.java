package javaInterviewQuestion;

import java.util.Iterator;
import java.util.Scanner;

public class PrintTriangle4 {

	public static void main(String[] args) {
		// Example for print triangle
		
		/*
		  Scanner scanner=new Scanner(System.in);
		  System.out.println("enter the number of lines:");
		  
		  int numberoflines = scanner.nextInt();
		  
		  int row,column=0; for (row=0;row<numberoflines;row++) {
		  
		  for (column=0;column<=row;column++) { System.out.print("*"); }
		  System.out.println(); }
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the rows:");
		
		int startingnumber=1;
		int limit;
		limit=scanner.nextInt();
		int row,column;
		for(row=0;row<limit;row++) {
			for(column=0;column<=row;column++) {
				System.out.print(startingnumber+" ");
				startingnumber=startingnumber+1;
			}
			System.out.println();
		}
	}
}
