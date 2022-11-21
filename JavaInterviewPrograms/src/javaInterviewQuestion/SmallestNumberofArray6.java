package javaInterviewQuestion;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SmallestNumberofArray6 {

	Integer givenarray[]= {2,1,3,5,4};
	public void findsmallest() {
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<givenarray.length;i++) {
			if(givenarray[i]<smallest) {
				smallest=givenarray[i];
			}
		}
		System.out.println("smallest number is :" + smallest);
	}

	// using arrays
	public void usingarrays() {

		Arrays.sort(givenarray);
		System.out.println(givenarray[0]);
	}

	//using collections

	public void usingcollections() {
		List<Integer> list=Arrays.asList(givenarray);
		Collections.sort(list);
		Integer small = list.get(0);
		System.out.println(small);
	}

	public static void main(String[] args) {
		// example of Smallest Number of Array
		SmallestNumberofArray6 array=new SmallestNumberofArray6();
		//array.findsmallest();
		//array.usingarrays();
		array.usingcollections();
	}
}
