//9.Initialize and print all elements of a 2D array.

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		int a[][] = new int[3][5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Enter number");
				a[i][j] = sc.nextInt();
			}
			System.out.println(" ");
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println(" ");
		}

	}

}