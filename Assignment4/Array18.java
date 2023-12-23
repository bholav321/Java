//Q.18 Write a Java program to add two matrices of the same size

import java.util.Scanner;

class Test {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter row");
	int row = sc.nextInt();
	System.out.println("Enter column");
	int column = sc.nextInt();
	int a[][] = new int[row][column];
	for(int i=0; i<row; i++){
	   for(int j=0; j<column; j++){
		System.out.println("Enter array element ");
		a[i][j] = sc.nextInt();
		}
	}
	for(int i=0; i<row; i++){
	   for(int j=0; j<column; j++){
		System.out.print("    "+a[i][j]);
	   }
	System.out.println(" ");
	}

  }

}