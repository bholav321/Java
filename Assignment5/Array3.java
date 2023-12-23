//Write a program for Swapping Two Arrays .

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int array1[] = new int[1
];
	int array2[] = new int[1];
	int temp[] = new int[1];
	System.out.println("Enter first array element");
	for(int i=0; i<1; i++){
	array1[i] = sc.nextInt();
	}
 	System.out.println("Enter second array element");
	for(int i=0; i<1; i++){
	array2[i] = sc.nextInt();
	}
	for(int i=0; i<1; i++){
	temp[i] = array1[i];
	array1[i] = array2[i];
	array2[i] = temp[i];
	}
	System.out.println("Swapping Array");
	for(int i=0; i<1; i++){
	System.out.println("Array 1 = "+array1[i]);
	System.out.println("Array 2 = "+array2[i]);
	}
	
  }
 

}