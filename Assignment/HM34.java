// Find even odd using switch case 

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num;
	System.out.println("Enter a number");
	num = sc.nextInt();
	switch (num%2){
	case 0:
	System.out.println(num+ " = is positive");
	break;
	case 1:
	System.out.println(num+ " = is negative");
	break;
	
	
	}

  }

}
