//WAP to calculate area of rectangle

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int l,b;
	System.out.println("Enter length");
	l = sc.nextInt();
	System.out.println("Enter breadth");
	b = sc.nextInt();
	int a;
	a = l*b;
	System.out.println(a);
  }
}