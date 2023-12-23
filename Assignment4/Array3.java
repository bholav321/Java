//wap to ask 5 names from user and check if particular name exists in array or not .

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter number");
			a[i] = sc.nextInt();
		}
		System.out.println("Enter number for checking");
		int b = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			if (a[i] == b)
				System.out.println("found " + b + "index number" + i);
		}		
		// System.out.println("Not found ");
	}

}