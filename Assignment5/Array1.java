//Write a program to make a Jagged Array .

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter row");
	int row = sc.nextInt();
	int rowcol;
	int a[][] = new int[row][];
	for(int i=0; i<row; i++){
	   System.out.println("Enter column for the row");
	    rowcol = sc.nextInt();
		a[i] = new int[rowcol];
	}
	for(int i=0; i<row; i++){
	   for(int j=0; j<a[i].length; j++){
		System.out.println("Enter column element");
		a[i][j] = sc.nextInt();
	   }
	}
	for(int i=0; i<row; i++){
	   for(int j=0; j<a[i].length; j++){
		System.out.print(a[i][j]);
	   }
	System.out.println(" ");
	}
  }

}


