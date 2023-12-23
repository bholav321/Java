//Write a Java program to calculate the average value of array elements.

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter number");
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < 5; j++) {
			sum = sum + a[j];
		}
		int Average = sum / 5;
		System.out.println("Average = " + Average);
	}
}