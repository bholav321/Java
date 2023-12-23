//Check given character is vowel or not using switch case 

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char c;
	System.out.println("Enter any character");
	c = sc.next().charAt(0);
	switch (c){
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
	System.out.println(c+"  "+ "is a vowel");
	break;
	default:
	System.out.println(c+"  "+ "is not a vowel");
	break;
	
	}
	

  }

}