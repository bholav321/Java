//WAP to print fibonacci series.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	int i = 1;
	int a = -1, b = 1;
	for(i=1 ; i<=num ; i++){
	c = a+b;
	a = b;
	b = c;
	System.out.println(c);
	}

  }


}