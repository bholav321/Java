//61) WAP to find out all the leap years between two entered years

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 1st year");
	int year1 = sc.nextInt();
	System.out.println("Enter 2nd year");
	int year2 = sc.nextInt();
	int i;
	for(i=year1; i<=year2; i++){
	if(i%4==0 && i%100!=0|| i%400==0)
	System.out.println(i);
	}
  }
}