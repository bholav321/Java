//WAP to calculate the percentage of students

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e;
	System.out.println("Enter math no....");
	a = sc.nextInt();
	System.out.println("Enter social no....");
	b = sc.nextInt();
	System.out.println("Enter science no....");
	c = sc.nextInt();
	System.out.println("Enter hindi no....");
	d = sc.nextInt();
	System.out.println("Enter english no....");
	e = sc.nextInt();
	int Percentage;
	Percentage = ((a+b+c+d+e)/5);
	System.out.println("Percentage=" +Percentage);
  }

}