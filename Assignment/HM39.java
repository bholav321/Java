//Write a java program to input electricity unit charges and calculate total electricity bill according to the given condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit //For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill. 

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double unit;
	System.out.println("Enter Unit");
	unit = sc.nextDouble();
	double electricitybill;
	if (unit<50)
	electricitybill = (unit*0.5);
	else if (unit<150)
	electricitybill = (unit*0.75);
	else if (unit<250)
	electricitybill = (unit*1.20);
	else
	electricitybill = (unit*1.50);
	
	double surcharge;
	surcharge = (electricitybill*20/100);
	electricitybill = electricitybill+surcharge;
	System.out.println("Electricity Bill : "+electricitybill);
  }

}