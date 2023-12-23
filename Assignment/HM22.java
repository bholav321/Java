//Print number between 1 to 5 in word format 

import java.util.Scanner;

class Test{
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter a number b/w 1 to 5");
	n = sc.nextInt();
	if (n==1)
	System.out.println(+n+("= one"));
	else if (n==2)
	System.out.println(+n+("= two"));
	else if (n==3)
	System.out.println(+n+("= three"));
	else if (n==4)
	System.out.println(+n+("= four"));
	else 
	System.out.println(+n+("= five"));
  }
}

