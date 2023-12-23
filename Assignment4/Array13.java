//Write a program to array elements to print sum of Cubic Values

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		int a[] = new int[4];
		int b = 1, sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println("Enter number");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			b = a[i] * a[i] * a[i];
			System.out.println(b);
			sum = sum + b;
		}
		System.out.println("Sum = " + sum);

	}

}
