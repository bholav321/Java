// WAP to enter an integer number and check it is prime or not

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner rahul = new Scanner(System.in);
	System.out.println("Enter an integer no...");
	int n = rahul.nextInt();
	int i = 1;
	int c = 0;
	while (i<=n){
	if (n%i==0)
	c++;
	i++;
	}
	if(c==2)
	System.out.println("Prime no.");
	else {
	System.out.println("Not Prime no.");
	}
  }

}