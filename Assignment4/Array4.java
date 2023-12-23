//wap to print max and minimum value in given array

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		int a[] = { 2, 1, 3, 5, 6 };
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < 5; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("maximum value = " + max);
		System.out.println("minimum value = " + min);
	}
}