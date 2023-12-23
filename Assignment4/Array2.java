//wap to define an array of integer and assign value in program and print sum of all values

import java.util.Scanner;
class Test{
  public static void main(String[] args){
	int a[] = new int[10];
	int sum=0;
	Scanner sc = new Scanner(System.in);
	for(int i=0; i<10; i++){
	    System.out.println("Enter number");
	    a[i] = sc.nextInt();
	}
	for(int j=0; j<10; j++){
	    sum = sum+j;
	}
	System.out.println("Sum= "+sum);
  }
}