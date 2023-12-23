//Write a java program to accept the cost price of a bike
  //  and display the road tax to be paid according to the 
    //following criteria.
   // Cost Price(In Rs)		Tax
   //  > 100000			 15%
   //  >50000 and <=100000	 10%
    // <=50000			 5%	

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int bike;
	System.out.println("Enter Bike cost");
	bike = sc.nextInt();
	int tax;
	if(bike>100000)
	 tax = (bike*15)/100;
	else if (bike>50000)
	 tax = (bike *10)/100; 
	else{
	tax = (bike*5)/100;
	}
	System.out.println("Tax on bike"+tax);
	System.out.println("With tax amount"+(bike+tax));
  }
}