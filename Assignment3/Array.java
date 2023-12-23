//wap to define an array of integer of size 6 .Take input from user and display it in reverse
//order

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	int a[] = new int[6];
	Scanner sc =new Scanner(System.in);
	int i;
	for( i=0; i<6; i++){
	System.out.println("Enter number");
	a[i] = sc.nextInt();
	}
	for( i=6; i>0; i--){
	System.out.print(a[i]);
	}
	

  }

}