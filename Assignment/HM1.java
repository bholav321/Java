//Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int length,breadth;
	System.out.println("Enter the lenght of rectangle");
	length = sc.nextInt();
	System.out.println("Enter the breadth of rectangle");
	breadth = sc.nextInt();
	if (length==breadth){
	System.out.println("it's square");
	}
	else{
	System.out.println("it's not a square");
	}
	
  }

}