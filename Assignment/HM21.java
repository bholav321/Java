//WAP to check wheather number is even or odd

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter a number");
	n = sc.nextInt();
	if (n%2==0)
	System.out.println("It is positive number");
	else
	System.out.println("It is negative number");

  }
}