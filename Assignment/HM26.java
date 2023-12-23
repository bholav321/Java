//W.A.P to check whether a charachter is an alphabet or not.

import java.util.Scnner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char c;
	System.out.println("Enter a character");
	if (c>'a' || c<'z' || c<'A' || c<'Z')
	System.out.println("it is an alphabet");
	else
	System.out.println("it is not an alphabat");
  }
}