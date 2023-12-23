//wap to ask 5 names from user and check if particular name exists in array or not .

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	String name[] = new String[5];
	Scanner sc = new Scanner(System.in);
	int i;
	for(i=0; i<5; i++){
	System.out.println("Enter name");
	name[i] = sc.nextLine();
	}
	System.out.println("Check name");
	String c = sc.nextLine();
	for(i=0; i<5; i++){
	c = name[i];
	for(int j=0; j<5; j++){
	}
	if(c==name[i])
	System.out.println("Already exists");
	else
	System.out.println("This name is not exists in array");
	}	
  }
}

