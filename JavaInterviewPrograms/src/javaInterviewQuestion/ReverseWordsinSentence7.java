package javaInterviewQuestion;

public class ReverseWordsinSentence7 {

	public static void main(String[] args) {
		// Reverse Word in Sentence

		String given="i love saravanakumar";
		 
		String reversed="";
		
		String[] split = given.split(" ");
		
		System.out.println(split.length);
		
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		
		for(int i=split.length-1;i>=0;i--) {
			reversed=reversed+split[i]+" ";
		}
		System.out.println(reversed);
	}

}
