// WAP to enter a character and check it is vowel or not.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char c;
	System.out.println("Enter character in lowercase");
	c = sc.next().charAt(0);
	if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
	System.out.println("it is vowel");
	}
	else{
	System.out.println("it is not a vowel");
	}
  }

}