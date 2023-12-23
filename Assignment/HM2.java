//A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int qty;
	System.out.println("How many quantity you purchased");
	qty = sc.nextInt();
	int cost = qty*100;
	
	if (cost>1000){
	int amount = ((cost*10)/100);
	System.out.println("Total Amount = "+(amount-cost));
	}
	else{
	System.out.println("Total Amount = "+cost);
	}
  }	
}