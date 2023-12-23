//WAP to calculate area of circle 

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int r;
	System.out.println("Enter radius");
	r = sc.nextInt();
	float pi = 3.14f;
	float a;
	a = pi*r*r;
	System.out.println(a);
  }
}