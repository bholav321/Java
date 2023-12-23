//Write a program to input choice from user. If user enter ‘+’ as choice then calculate addition of 2 number. If Choice ‘>’ then check which number is greaterst. If choice is ‘==’ then check //both number is equal or not.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char ch;
	System.out.println("Enter any operator which would you perform ('+','>','=')");
	ch = sc.next().charAt(0);
	if (ch=='+'){
	int num1,num2;
	System.out.println("Enter 1st number");
	num1 = sc.nextInt();
	System.out.println("Enter 2nd number");
	num2 = sc.nextInt();
	System.out.println(num1+num2);
	}
	else if (ch=='>'){
	int num1,num2;
	System.out.println("Enter 1st number");
	num1 = sc.nextInt();
	System.out.println("Enter 2nd number");
	num2 = sc.nextInt();
	System.out.println(num1>num2);
	}
	else if(ch=='='){
	int num1,num2;
	System.out.println("Enter 1st number");
	num1 = sc.nextInt();
	System.out.println("Enter 2nd number");
	num2 = sc.nextInt();
	System.out.println(num1==num2);
	}
	else{
	System.out.println("No one operator did you performe");
        }
  }

}