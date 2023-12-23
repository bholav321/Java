//program to check whether entered character is in uppercase
import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char c;
	System.out.println("Enter a character");
	c = sc.next().charAt(0);
	char ch;
	ch = (c>'A' && c<'Z') ? (char)c : (c>'a' && c<'z') ? (char)(c-32) : (char)c;
	System.out.println(ch);
	
	
	


  }

}