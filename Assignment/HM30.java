// Write a Java program to count total number of notes in given amount. 

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int notes,amount;
	System.out.println("Enter which note you want");
	notes = sc.nextInt();
	System.out.println("Enter amount");
	amount = sc.nextInt();
	int totalnotes;
	totalnotes = amount/notes;
	System.out.println("No. of notes = "+totalnotes);
	
 
  }

}