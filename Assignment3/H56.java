//56) WAP to print factorial of all the numbers between two entered numbers

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st no...");
	int n1 = sc.nextInt();
	System.out.println("Enter 2nd no...");
	int n2 = sc.nextInt();
	int i,j;
	for(i=n1; i<=n2; i++){
	int fact = 1;
	for(j=1; j<=i; j++){
	fact = fact*j;
	}
	System.out.println(fact);
  	}
  }
}
	
	