//42) WAP to find out HCF of a number

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int n2 = sc.nextInt();
		int i = 1;
		int HCF = 1;
		int max = n1 > n2 ? n1 : n2;
		for (i = 1; i <= max; i++) {
			if (n1 % i == 0 && n2 % i == 0)
				HCF = i;
		}
		System.out.println(HCF);

	}

}