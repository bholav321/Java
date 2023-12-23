//Program to perform arithmetic operation using switch case

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner rahul = new Scanner(System.in);
	int a,b;
	System.out.println("Enter 1st number");
	a = rahul.nextInt();
	System.out.println("Enter 2nd number");
	b = rahul.nextInt();
	char c;
	System.out.println("Enter any operator (+,-,*,/) for perform that operation");
	c = rahul.next().charAt(0);
	switch (c){
	case '+': System.out.println(a+b);break;
	case '-': System.out.println(a-b);break;
	case '*': System.out.println(a*b);break;
	case '/': System.out.println(a/b);break;
	default: System.out.println("Invalid operator");
	}
	

  }


}