//Write a Java program to calculate profit or loss.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int SP,CP;
	System.out.println("Enter selling price");
	SP = sc.nextInt();
	System.out.println("Enter cost price");
	CP = sc.nextInt();
	int profit,loss;
	profit = SP-CP;
	loss = CP-SP;
	System.out.println("Profit = "+profit);
	System.out.println("loss = "+loss);
	
  }

}