//WAP to enter a character and check it is vowel or not

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char ch;
	System.out.println("Enter a character");
	ch = sc.next().charAt(0);
	
	String max = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ? ("it is vowel") : ("it is not vowel");
	System.out.println(max);
	
	

  }
}
