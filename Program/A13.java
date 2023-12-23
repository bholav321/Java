// Program to convert uppercase to lowercase

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char c;
	System.out.println("Enter a character");
	c = sc.next().charAt(0);
	char ch;
	ch = (char)(c+32);
	System.out.println(ch);

	
	


  }

}