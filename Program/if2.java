 //Write A Java Program to input an age of person and check he is eligible for voting or not.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int age;
	System.out.println("Enter person's age");
	age = sc.nextInt();
	if (age>=18){
	System.out.println("Eligible for votting");
	}
	else{
	System.out.println("Not eligible for votting");
	}
	

  }
}