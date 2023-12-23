// Write a Java program to print the following grid.
// Expected Output :


import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		int a[][] = new int[8][8];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print("- ");
			}
			System.out.println(" ");
		}
	}
}