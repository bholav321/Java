//Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
//	Percentage >= 90% : Grade A 
//	Percentage >= 80% : Grade B 
//	Percentage >= 70% : Grade C 
//	Percentage >= 60% : Grade D 
//	Percentage >= 40% : Grade E 
//	Percentage < 40% : Grade F

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int Physics,Chemistry,Biology,Mathes,Computer;
	System.out.println("Enter Physics no...");
	Physics = sc.nextInt();
	System.out.println("Enter Chemistry no...");
	Chemistry = sc.nextInt();
	System.out.println("Enter Biology no...");
	Biology = sc.nextInt();
	System.out.println("Enter Mathematics no...");
	Mathes = sc.nextInt();
	System.out.println("Enter Computer no...");
	Computer = sc.nextInt();
	int percentage;
	percentage = ((Physics+Chemistry+Biology+Mathes+Computer)/5);
	System.out.println("Percentage = "+percentage);
	if (percentage>=90)
	System.out.println("Grade A");
	else if (percentage>=80)
	System.out.println("Grade B");
	else if (percentage>=70)
	System.out.println("Grade C");
	else if (percentage>=60)
	System.out.println("Grade D");
	else if (percentage>=40)
	System.out.println("Grade E");
	else 
	System.out.println("Grade F");
  }

}