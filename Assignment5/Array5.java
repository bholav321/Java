//Write a Java program to test two arrays' equality.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first array size");
	int size = sc.nextInt();
	int a[] = new int[size];
	System.out.println("Enter second array size");
	int size1 = sc.nextInt();
	int b[] = new int[size1];
	if(a.length == b.length)
		System.out.println("Array's size are equal");
	else
		System.out.println("Array's size are not equal");
	
  }
}