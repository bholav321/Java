//WAP to enter 2 number and both numbers are equal or not, if not then find out greater number.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b;
	System.out.println("Enter 1st no...");
	a = sc.nextInt();
	System.out.println("Enter 2nd no...");
	b = sc.nextInt();
	if (a==b){
	System.out.println("Both numbers are equal");
	}
	else if (a>b){
	System.out.println("a is greater no. = "+a);
	}
	else{
	System.out.println("b is greater no. = "+b);
	}
	
  }

}
