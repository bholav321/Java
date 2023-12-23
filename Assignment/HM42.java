// Bitwise ^ operator
// WAP to exchange value of two variable without using third variable and arithmetic operator


import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b;
	System.out.println("Enter 1st number");
	a = sc.nextInt();
	System.out.println("Enter 2nd number");
	b = sc.nextInt();
	a = a^b;
	b = a^b;
	a = a^b;
	System.out.println("a = "+a);
	System.out.println("b = "+b);
  }	

}