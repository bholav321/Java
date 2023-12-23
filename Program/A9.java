// Write a program to to swap to number without using third variable

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b;
	System.out.println("Enter 1st no...");
	a = sc.nextInt();
	System.out.println("Enter 2nd no...");
	b = sc.nextInt();
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("a = "+a+ " b = "+b);
  }
}