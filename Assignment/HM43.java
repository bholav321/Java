//WAP to check given year is a leap year or not 

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int year;
	System.out.println("Enter the year");
	year = sc.nextInt();
	if (year%4==0 && year%100!=0 || year%400==0)
	System.out.println("This is a leap year");
	else
	System.out.println("This is not a leap year");

  }
	

}