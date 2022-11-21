package javaInterviewQuestion;

public class SwapTwoNumber2 {

	// EXAMPLE FOR SWAP TWO number with using third variable

	//1.Using third party
	public void withthirdvariable() {		
		int mysalary=20;
		int superiorsalary=100;
		System.out.println("Before mine salary"+ mysalary +"Before superior salary"+ superiorsalary);
		int temp=mysalary;
		mysalary=superiorsalary;
		System.out.println("after mine salary"+ mysalary +"after superior salary"+ superiorsalary);
	}
	public void withoutthirdvariable() {
		
		//2.using without third variable
		
	//	first=first-second , second=first+second , first=second-first
		
	//	first=first*second , second=first/second , first=first/second
		
		int firstmysalary=20;
		int secondmanagersalary=100;
		
		System.out.println("Before firstmysalary" + firstmysalary + "Before secondmanagersalary " + secondmanagersalary);
		
		firstmysalary=firstmysalary-secondmanagersalary;
		secondmanagersalary=firstmysalary+secondmanagersalary;
		firstmysalary=secondmanagersalary-firstmysalary;
		
		System.out.println("after firstmysalary" + firstmysalary + "after secondmanagersalary " + secondmanagersalary);
	}
	
	
	public static void main(String[] args) {

		SwapTwoNumber2 number=new SwapTwoNumber2();
		number.withoutthirdvariable();
		
		
	}

}
