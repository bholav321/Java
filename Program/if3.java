//Write a proram to input the marks of 5 subject of student. then calculate the percentage. if percentage is greater then 60 print you are passed with 1st divistion , if percetnage is between 50 to 59 then print 2nd division, if percentage is between 33 to 49 then print 3rd division otherwise failed. You have print the marksheet with proper formate with total marks obtained and division.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e;
	System.out.println("Enter mathes no...");
	a = sc.nextInt();
	System.out.println("Enter science no...");
	b = sc.nextInt();
	System.out.println("Enter social no...");
	c = sc.nextInt();
	System.out.println("Enter hindi no...");
	d = sc.nextInt();
	System.out.println("Enter english no...");
	e = sc.nextInt();
	float n;
	n = (a+b+c+d+e)/5;
	System.out.println("Percentage = "+n+"%");
	if (n>=60){
	System.out.println("First Division");
	}
	else if (n>=50){
	System.out.println("Second Division");
	}
	else if (n>=33){
	System.out.println("Third Division");
	}
	else{
	System.out.println("Failed");
	}
	
  }

}