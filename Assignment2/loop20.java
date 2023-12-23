//WAP to print all prime number from 101 to 199 

import java.util.Scanner;
 class Test {
    public static void main (String args []) {
        int  count = 0;
        System.out.println ("Prime numbers between given range are :");
	int i,j;	
	for( i = 101; i <= 199; i ++) {
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

	
	
	