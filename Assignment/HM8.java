
//Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.


import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char c;
	System.out.println(" medical cause or not ('Y' or 'N')");
	c = sc.next().charAt(0);
	if (c=='Y')
	System.out.println("Allow for sit");
	else{
	System.out.println("Not allow for sit");
	}
	
	
  }
	
}