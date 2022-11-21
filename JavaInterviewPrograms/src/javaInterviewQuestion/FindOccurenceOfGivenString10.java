package javaInterviewQuestion;

import java.util.Iterator;

public class FindOccurenceOfGivenString10 {

	public static void main(String[] args) {
		// Find Occurence Of Given String using iteration
		/*String name="saravanakumAr";

		char tofind='a';
		int occurence=0;
		name=name.toLowerCase();
		
	for (int i = 0; i < name.length(); i++) {
		if(name.charAt(i)==tofind) {
			occurence=occurence+1;
		}
	}
	System.out.println(tofind + "is present" + occurence +"number of times ");*/
	
	
	//without iteration
	
	String name="saravanakumar";
	char tofind='a';
	
	name=name.toUpperCase();
	String chartoFind=Character.toString(tofind).toUpperCase();
	
	int actuallength = name.length();
	System.out.println(actuallength);
	
	name=name.replace(chartoFind, "");
	int lengthafterreplace = name.length();
	System.out.println(lengthafterreplace);
	
	System.out.println(actuallength-lengthafterreplace);
	}

}
