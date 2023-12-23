//Swap without using third variable and without using + , - operator

import java.util.Scanner;

class Test{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b;
	System.out.println("Enter 1st no....");
	a = sc.nextInt();
	System.out.println("Enter 2nd no....");
	b = sc.nextInt();
	a = a * b;
	b = a / b;
	a = a / b;
	System.out.println("Swap no.");
	System.out.println("1st no. = "+a);
	System.out.println("2nd no. = "+b); 
	
 
  }


}