//WAP to exchange value to two variable with third variable and without third variable

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b;
	System.out.println("Enter 1st number");
	a = sc.nextInt();
	System.out.println("Enter 2nd number");
	b = sc.nextInt();
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("a = "+a);
	System.out.println("b = "+b);
  }	

}