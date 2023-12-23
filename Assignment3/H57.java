//57) WAP to print all the prime numbers between two entered numbers

import java.util.Scanner;
 class Test {
    public static void main (String args []) {
        int  count = 0;
        System.out.println ("Prime numbers between given range are :");
	int i,j;	
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	for( i = n1; i <= n2; i ++) {
        for( j = 2; j < i; j ++) {
        if(i % j == 0) {
        count = 0;
        break;
        } else {
        count = 1;
        }
        }
        if(count == 1) {
        System.out.println (i);
            }
        }
    }
}	

	
	
	
	
	
	