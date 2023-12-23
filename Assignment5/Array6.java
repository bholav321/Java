//Find a missing number in an array

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int a[] = new int[5];
	int b[] = new int[5];
	int i,j;
	for( i=0; i<a.length; i++){
	   System.out.println("Enter first array element");
	   a[i] = sc.nextInt();
	}
	for( j=0; j<a.length; j++){
	   System.out.println("Enter second array element ");`
	   b[j] = sc.nextInt();
	}
	for( i=0; i<a.length; i++){
	   for( j=i; j<=i; j++){
		if(a[i] != b[j])
		System.out.println("Missing number " +a[i]);		
	   }   
	}
  }
}