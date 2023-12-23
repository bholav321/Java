//50) WAP to find out all the palindrome numbers between two entered numbers

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st no...");
	int n1 = sc.nextInt();
	System.out.println("Enter 2nd no...");
	int n2 = sc.nextInt();
	int i;
	
	for(i=n1 ; i<=n2; i++){
	int num = i;
	int rev = 0;
	while(num!=0){
	int digit = num%10;
	rev = rev*10+digit;
	num = num/10;
	}
	if(i==rev)
	System.out.println(rev);
	}
  }
}