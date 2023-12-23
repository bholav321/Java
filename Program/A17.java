//Program to convert person height from inches to cm

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	float ph;
	System.out.println("Enter person's height in inches");
	ph = sc.nextFloat();
	float I;
	I = ph*2.54f;
	System.out.println("Person's height in inches = "+I+"cm");
	
  }
}