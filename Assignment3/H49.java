//49) WAP to find out all the perfect numbers between two entered numbers

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no..");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd no..");
		int n2 = sc.nextInt();
		int i, j, sum = 0;
		for (i = n1; i <= n2; i++) {
			for (j = 1; j <= i; j++) {
				if (i % j == 0)
					sum = sum + j;
			}
			if (i == sum)
				System.out.println(i + " Perfect no...");
			else
				System.out.println("Not Perfect no...");
		}
	}
}