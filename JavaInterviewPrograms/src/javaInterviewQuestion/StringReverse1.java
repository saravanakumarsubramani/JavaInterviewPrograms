package javaInterviewQuestion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringReverse1 {

	public static void main(String[] args) {
		
		//1.example for Stringbuffer
		
		String given="saravanakumar";
		
		StringBuffer buffer=new StringBuffer();	
		buffer.append(given);
		
		System.out.println(buffer.reverse());
	
		
		//2.using own method
		
		/*	String given="agni";
		char[] charArray = given.toCharArray();
		String reversed="";
		
	for (int i =charArray.length-1; i >=0; i--) {
		
		reversed=reversed+charArray[i];
	}
	System.out.println(reversed);*/
		
		//3.Using collection
		
		/*
		 * String given="agni"; char[] charArray = given.toCharArray(); List<Character>
		 * list=new ArrayList<Character>();
		 * 
		 * for (Character character : charArray) { list.add(character); }
		 * Collections.reverse(list); ListIterator iterator=list.listIterator(); while
		 * (iterator.hasNext()) { System.out.println(iterator.next());
		 * 
		 * }
		 */
	}
}

	
	

