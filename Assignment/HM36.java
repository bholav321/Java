//Program to perform arithmetic operation using switch case

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num1,num2;
	System.out.println("Enter 1st number");
	num1 = sc.nextInt();
	System.out.println("Enter 2nd number");
	num2 = sc.nextInt();
	char operator;
	System.out.println("Enter a operator('+','-','*','/')");
	operator = sc.next().charAt(0);
	switch (operator){
	case '+':
	System.out.println("num1+num2 = "+(num1+num2));
	break;
	case '-':
	System.out.println("num1-num2 = "+(num1-num2));
	break;
	case '*':
	System.out.println("num1*num2 = "+(num1*num2));
	break;
	case '/':
	System.out.println("num1/num2 = "+(num1/num2));
	break;
	default:
	System.out.println("Try Again");
	}
  }


}