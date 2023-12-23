//A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
//INPUT : 1234        OUTPUT : 4321
//INPUT : 5982        OUTPUT : 2895 

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc =  new Scanner(System.in);
	int n;
	System.out.println("Enter four digit no.. ");
	n = sc.nextInt();
	int dig1,dig2,dig3,dig4;
	dig1 = n/1000;
	dig2 = ((n%1000)/100);
	dig3 = (((n%1000)%100)/10);
	dig4 = (n%10);
	System.out.print("OUTPUT = "+dig4+""+dig3+""+dig2+""+dig1);
	

  }

}
