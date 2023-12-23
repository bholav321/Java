//Write to program to find out volume of cylinder pi*r*r*h

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	float pi = 3.14f;
	int r,h;
	System.out.println("Enter radius");
	r = sc.nextInt();
	System.out.println("Enter height");
	h = sc.nextInt();
	float v;
	v = pi*r*r*h;
	System.out.print(v);
  }

}