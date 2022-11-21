package javaInterviewQuestion;

public class ReplaceVowelsWithDollar15 {

	public static void main(String[] args) {
		// 1.Replace Vowels  With Dollar 
		String giventext="I miss Mahendra Singh Dhoni";
		/*char[] charArray = giventext.toCharArray();
		
		for (int i = 0; i < giventext.length(); i++) {
			
			if(giventext.charAt(i)=='A'||giventext.charAt(i)=='E'||giventext.charAt(i)=='I'||
					giventext.charAt(i)=='O'||giventext.charAt(i)=='U'||giventext.charAt(i)=='a'||
					giventext.charAt(i)=='e'||giventext.charAt(i)=='i'||giventext.charAt(i)=='o'||
					giventext.charAt(i)=='u')
			
			charArray[i]='*';
			}
		for (int i = 0; i < giventext.length(); i++) {
			System.out.print(charArray[i]);
		}*/
		
		//2.Replaceall method
		
		String replaceAll = giventext.replaceAll("[AEIOUaeiou]", "^");
		
		System.out.println(replaceAll);
	}
	
}
