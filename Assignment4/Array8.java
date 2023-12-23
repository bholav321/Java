//8.Write a program to find the sum and product of all elements of an array.

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0, b = 1;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter number");
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < 5; j++) {
			sum = sum + a[j];
			b = b * a[j];
		}
		System.out.println("Sum = " + sum);
		System.out.println("Product = " + b);
	}
}
