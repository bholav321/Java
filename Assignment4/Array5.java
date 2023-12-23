//wap to find and print even numbers in given array

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter number");
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < 5; j++) {
			if (a[j] % 2 == 0)
				System.out.println("Even number= " + a[j]);
		}
	}
}