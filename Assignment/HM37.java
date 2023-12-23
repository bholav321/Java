//W.A.P to check whether given number is even or odd Without using % operator. 

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num;
	System.out.println("Enter a number");
	num = sc.nextInt();
	switch (num&1){
	case 0:
	System.out.println(num+ "is even");
	break;
	case 1:
	System.out.println(num+ "is odd");
	break;
	}

  }

}
