//54) WAP to print all the even numbers between two entered numbers

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st no...");
	int n1 = sc.nextInt();
	System.out.println("Enter 2nd no...");
	int n2 = sc.nextInt();
	int i;
	for(i=n1; i<=n2; i++){
	if(i%2==0)
	System.out.println(i);
	}
  }
}