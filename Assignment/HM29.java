//Write a Java program to input day number and print week day. 

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter day");
	n = sc.nextInt();
	int week;
	week = n/7;
	System.out.println("no. of weeks="+week);
	

  }

}