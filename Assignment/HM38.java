// W.A.P to check whether the traingle is equilateral, scalene, or isosceles. Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length. //Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal. Scalene triangle: A scalene triangle is a triangle that has three unequal sides.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter 1st side value");
	a = sc.nextInt();
	System.out.println("Enter 2nd side value");
	b = sc.nextInt();
	System.out.println("Enter 3rd side value");
	c = sc.nextInt();
	if (a==b && c==0)
	System.out.println("Isosceles triangle");
	else if (a==b && b==c)
	System.out.println("Equilateral triangle");
	else
	System.out.println("Scalene trianle");

  }


}