//Print number between 1 to 5 in word format 

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner rahul = new Scanner(System.in);
	int n;
	System.out.println("Enter an integer number b/w 1 to 5");
	n = rahul.nextInt();
	switch(n){
	case 1: System.out.println("One");break;
	case 2: System.out.println("Two");break;
	case 3: System.out.println("Three");break;
	case 4: System.out.println("Four");break;
	case 5: System.out.println("Five");break;
	default: System.out.println("Invalid value");
	}
  }

}