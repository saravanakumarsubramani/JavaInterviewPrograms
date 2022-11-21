package javaInterviewQuestion;

import java.util.Iterator;

public class ArrayContainsElemntorNot8 {

	int[] array= {1,2,3,4,5,3};
	
	int numbertoFind=1;
	boolean found=false;              
	
	public void presentOrnot() {
	for (int i : array) {
		if(i==numbertoFind) {
			found=true;
			break;
		}
	}
	if(found) {
		System.out.println("element present");
	}else {
		System.out.println("element not present");
	}
	}
	
	public static void main(String[] args) {
		// Example for Array Contains Element or Not
		ArrayContainsElemntorNot8 arrayContainsElemntorNot8=new ArrayContainsElemntorNot8();
		arrayContainsElemntorNot8.presentOrnot();
	}

}
