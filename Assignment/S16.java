//W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ then convert //Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit. 

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char ch;
	System.out.println("Enter a character ('c','C' & 'f','F')");
	ch = sc.next().charAt(0);
	float temp;
	switch (ch){
	case 'c': 
	case 'C':
	float f;
	System.out.println("Enter fahrenheit value");
	f = sc.nextInt();
	temp = ((f-32)*5/9);
	System.out.println(temp);
	break;
	case 'f':
	case 'F':
	float c;
	System.out.println("Enter Celcius value");
	c = sc.nextInt();
	temp = ((c*9/5)+32);
	System.out.println(temp);
	break;
	default: 
	System.out.println("Invalid character");
	}
	

  }

}