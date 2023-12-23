//.A school has following rules for grading system:
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.

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
	if (marks>80)
	System.out.println("Marks = "+marks+"  +A grade");
	else if (marks>60){
	System.out.println("Marks = "+marks+"  +B grade");
	}
	else if (marks>50){
	System.out.println("Marks = "+marks+"  +C grade");
	}
	else if (marks>45){
	System.out.println("Marks = "+marks+"  +D grade");
	}
	else if (marks>25){
	System.out.println("Marks = "+marks+"  +E grade");
	}
	else{
	System.out.println("Marks = "+marks+"  +F grade");
	}
  }
}