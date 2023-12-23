//Write a program to check if a year is leap year or not.
//If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400. 

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int year;
	System.out.println("Enter year");
	year = sc.nextInt();
	if (year%4==0 && year%100!=0 || year%400==0)
	System.out.println("It is leap year : "+year);
	else{
	System.out.println("It is not leap year :"+year);
	}
	

  }

}