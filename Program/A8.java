//Write a program to swap to number.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter 1st no...");
	a = sc.nextInt();
	System.out.println("Enter 2nd no...");
	b = sc.nextInt();
	System.out.println("Enter 3rd no...");
	c = sc.nextInt();
	a = b;
	b = c;
	c = a;
	System.out.println("a ="+a+ " b = "+b+ " c = "+c);
  }

}