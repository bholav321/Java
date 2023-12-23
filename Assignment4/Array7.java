//wap to find and print prime numbers in given array

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		int a[] = new int[5];
		int c = 0, i;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 5; i++) {
			System.out.println("Enter number");
			a[i] = sc.nextInt();
		}
		for (i = 0; i < 5; i++) {
			for (int j = 2; j <= a[i] / 2; j++) {
				if (a[i] % j == 0) {
					c++;
					break;
				}
			}
			if (c == 0)
				System.out.println(a[i] + " is a prime number");
			c = 0;
		}
	}
}
