//60) WAP to print Square, Cube and Square Root of all numbers from 1 to N

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int num = sc.nextInt();
	int i,j;
	for(i = 1; i<=num; i++){
	int a,b;
	a = i*i;
	b = i*i*i;
	System.out.println("Square root="+Math.sqrt(i));
	System.out.println("Squart = "+a);
	System.out.println("Cube= "+b);
	}
	
	

  }


}