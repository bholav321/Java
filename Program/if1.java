//Write A Java Program to Find Out the smallest between 3 distinct number

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter value of a..");
	a = sc.nextInt();
	System.out.println("Enter value of b..");
	b = sc.nextInt();
	System.out.println("Enter value of c..");
	c = sc.nextInt();
	if (a>b && a>c){
	System.out.println("a is greater no. = "+a);
	}
	else if(b>a && b>c){
	System.out.println("b is greater no. = "+b);
	}
	else{
	System.out.println("c is greater no. = "+c);
	}
  }

}