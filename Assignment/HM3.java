//.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int salary,service;
	System.out.println("Enter your salary");
	salary = sc.nextInt();
	System.out.println("Enter your service years");
	service = sc.nextInt();
	if (service>5){
	int bonus = (salary*5/100);
	System.out.println("Net bonus amount..."+(bonus+salary));
	}
	else{
	System.out.println("Net bonus amount..."+salary);
	}
	

  }

}