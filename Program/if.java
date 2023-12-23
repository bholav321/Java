//program to check whether entered character is in uppercase

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char c;
	System.out.println("Enter character value");
	c = sc.next().charAt(0);
	if (c>'A' && c<'Z'){
	System.out.println("Uppercase character");
	}
	else if(c>'a' && c<'z'){
	System.out.println("Lowercase character");
	} 
	else{
	System.out.println("Special character");
	}
	
	

  }

}
