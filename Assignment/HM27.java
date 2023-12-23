//Java program to check whether the triangle is valid or not if angles are given. Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180. 

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter 1st value");
	a = sc.nextInt();
	System.out.println("Enter 2nd value");
	b = sc.nextInt();
	System.out.println("Enter 3rd value");
	c = sc.nextInt();
	int sum;
	sum = a+b+c;
	if(sum==180)
	System.out.println("it is valid triangle");
	else
	System.out.println("it is not valid triangle");
	


  }

}