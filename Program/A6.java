//Find out the average of 5 numbers.
import java.util.Scanner;
class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e;
	System.out.println("Enter 1st no... ");
	a = sc.nextInt();
	System.out.println("Enter 2nd no... ");
	b = sc.nextInt();
	System.out.println("Enter 3th no... ");
	c = sc.nextInt();
	System.out.println("Enter 4th no... ");
	d = sc.nextInt();
	System.out.println("Enter 5th no... ");
	e = sc.nextInt();
	float n;
	n = ((a+b+c+d+e)/5);
	System.out.println("Average of five no...."+n);
 
  }

}