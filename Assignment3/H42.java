//42) WAP to find out  of a number

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 10;
		int n2 = 15;
		int i = 1, a = 1;
		for (i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0)
				a = i;
		}
		int lcm = n1 * n2 / a;
		System.out.println(lcm);

	}

}