//WAP to calculate the sum of series 1/1! + 2/2! + 3/3!.......n\n! 

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double num = sc.nextInt();
	double i = 1, a = 1, b = 0;
	while (i<=num){
	a = a*i;
	b = b+(i/a);
	i++;
	}
	System.out.println(b);
  }

}