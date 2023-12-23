//W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ then convert //Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit. 

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char a ;
	System.out.println("What would you convert first");
	a = sc.next().charAt(0);
	if (a=='C' || a=='c'){
	int f;
	System.out.println("Enter fahrenheit value");
	f = sc.nextInt();
	float c;
	c = ((f-32)*5/9);
	System.out.println(c);
	}
	else{
	int c;
	System.out.println("Enter Celcius value");
	c = sc.nextInt();
	float f;
	f = (c*9/5)+32;
	System.out.println(f);
	
	}
	
		
  }

}