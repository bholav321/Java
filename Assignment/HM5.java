//Take input of age of 3 people by user and determine oldest and youngest among them.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int A1,A2,A3;
	System.out.println("Enter 1st person age");
	A1 = sc.nextInt();
	System.out.println("Enter 2nd person age");
	A2 = sc.nextInt();
	System.out.println("Enter 3rd person age");
	A3 = sc.nextInt();
	if (A1>A2 && A1>A3)
	System.out.println("A1 is oldest person");
	else if (A2>A1 && A2>A3){
	System.out.println("A2 is oldest person");
	}
	else{
	System.out.println("A3 is oldest person");
	}
	
	if (A1<A2 && A1<A3)
	System.out.println("A1 is youngest person");
	else if (A2<A1 && A2<A3){
	System.out.println("A2 is youngest person");
	}
	else{
	System.out.println("A3 is youngest person");
	}	
	
  }

}