//53) WAP to print all the strong numbers between two entered numbers

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no...");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd no...");
		int num2 = sc.nextInt();
		int i, j, sum = 0;
		int rev=0;
		for (i = num1; i <= num2; i++) {
			int c = i;
			while (c > 0) {
				rev = c % 10;
				int fact = 1;
				for (j = 1; j <= rev; j++) {
					fact = fact * j;
				}
				sum = sum + fact;
				c = c / 10;
			}
			if (sum == i) 
				System.out.println(sum+" is a strong number");
				sum = 0;
			
		}

	}

}
