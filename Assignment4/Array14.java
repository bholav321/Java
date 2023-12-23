//14.Write a program in to array size to be user input print it

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Length of the array = " + a.length);
	}

}