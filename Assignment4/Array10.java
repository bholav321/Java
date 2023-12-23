//10.Take 20 integer inputs from user and print the following:
//number of positive numbers
//number of negative numbers
//number of odd numbers
//number of even numbers
//number of 0s.

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		int a[] = new int[20];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 20; i++) {
			System.out.println("Enter number");
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < 20; j++) {
			if (a[j] > 0)
				System.out.println("Number is positive= " + a[j]);
			if (a[j] < 0)
				System.out.println("Number is negative= " + a[j]);
			if (a[j] % 2 == 0)
				System.out.println("Even number = " + a[j]);
			else
				System.out.println("Odd number = " + a[j]);
			if (a[j] == 0)
				System.out.println("Number is zero = " + a[j]);
		}
	}

}