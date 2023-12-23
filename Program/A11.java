 //WAP to find out compound interest.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int p,r,t,n;
	System.out.println("Enter principal value.... ");
	p = sc.nextInt();
	System.out.println("Enter rate....");
	r = sc.nextInt();
	System.out.println("Enter time....");
	t = sc.nextInt();
	
	int A; 
	A = p*(1+r/100)*t;
	int ci;
	ci = A-p;
	System.out.println("compound interest = "+ci);
  }
}