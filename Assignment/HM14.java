//Write a program to accept percantage from the user and
//display grade according to the following criteria
 // Marks	  		Grade
 // > 90       		 	 A
 // >80 and <=90		 B
 // >=60 and <=80		 C
  //below 60			 D

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name");
	String name;
	name = sc.nextLine();
	int marks;
	System.out.println("Enter your marks");
	marks = sc.nextInt();
	if (marks>90)
	System.out.println("Marks = "+marks+"  +A grade");
	else if (marks>80){
	System.out.println("Marks = "+marks+"  +B grade");
	}
	else if (marks>60){
	System.out.println("Marks = "+marks+"  +C grade");
	}
	else if (marks<60){
	System.out.println("Marks = "+marks+"  +D grade");
	}
	
  }
}