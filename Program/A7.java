//Program to calculate simple interest

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int p,r,t;
	System.out.println("Enter principal value.... ");
	p = sc.nextInt();
	System.out.println("Enter rate....");
	r = sc.nextInt();
	System.out.println("Enter time....");
	t = sc.nextInt();
	float sp;
	sp = ((p*r*t)/100);
	System.out.println(sp);
  }
}