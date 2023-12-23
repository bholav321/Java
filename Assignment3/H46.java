//46) WAP to find out the sum of first and last digit of a user entered number 

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum, a;
		int digit = n % 10;
		while (n >= 10) {
			n = n / 10;
		}
		a = n;
		sum = digit + a;
		System.out.println(sum);

	}

}