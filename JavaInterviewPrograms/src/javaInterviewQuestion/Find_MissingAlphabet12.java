package javaInterviewQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Find_MissingAlphabet12 {

	public static void main(String[] args) {
		// Find_Missing Alphabet

		String given="abc";
		 given = given.toLowerCase();
		 given = given.replaceAll(" ", "");
		 String[] userArray = given.split("");
		 System.out.println(given);
		 String[] alphabets = "abcdefghijklmnopqrstuvwxyz".split("");
		 System.out.println(alphabets);
		 HashSet<String> set1=new HashSet<String>(Arrays.asList(userArray));
		 
		 HashSet<String> set2=new HashSet<String>(Arrays.asList(alphabets));
	
			set2.removeAll(set1);
			
			System.out.println(set2);
		}
	}


