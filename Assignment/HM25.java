//W.A.P to check the sign of given number.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int n;
	n = sc.nextInt();
	if(n>0)
	System.out.println("+ve sign");
	else
	System.out.println("-ve sign");
	

  }

}