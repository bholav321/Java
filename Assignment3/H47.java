//47) WAP to print tables of all the numbers between two entered numbers

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int n2 = sc.nextInt();
		int i, j, a = 0;
		for (i = n1; i <= n2; i++) {
			for (j = 1; j <= 10; j++) {
				a = i * j;
				System.out.println(a);
			}
			System.out.println("");
		}

	}

}
