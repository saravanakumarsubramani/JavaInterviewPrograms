package javaInterviewQuestion;

public class ConvertUpper_LowerCase16 {

	public static void main(String[] args) {
		// Convert Upper_Lower Case
		//Ascii->65-90 (upper case) /97-122 (lower case)
		//1.Upper case to lower case
		String input="Hello,I AM SARAVANAKUMAR";
		char[] charArray = input.toCharArray();

for (int i = 0; i < charArray.length; i++) {
	if (charArray[i]>=65 && charArray[i]<=90) {
		charArray[i]=(char) (charArray[i]+32);
	}
}
for (int i = 0; i < charArray.length; i++) {
	System.out.print(charArray[i]);
}

//2.lower case to Upper case

String giventext="i am riyaprasanth";
char[] charArray2 = giventext.toCharArray();

for (int i = 0; i < charArray2.length; i++) {
	if (charArray2[i]>=97&&charArray2[i]<=122) {
		charArray2[i]=(char) (charArray2[i]-32);
	}
}
for (int i = 0; i < charArray2.length; i++) {
	System.out.print(charArray2[i]);
}

	}
}
