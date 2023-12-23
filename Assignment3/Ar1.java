// WAP to take input from user and number1 to 10. find sum of that no.

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	int a[] = new int[10];
	Scanner sc = new Scanner(System.in);
	int b=0;
	for(int i=1; i<10; i++){
	System.out.println("Enter number");
	a[i] = sc.nextInt();
	}
	for(int i=1; i<10; i++){
	b = b+i;
	}
	System.out.println("Sum= "+b);
	
  }
}
class Test{
  public static void main(String[] args){
	char a[] = {'h','e','l','l','o'};
	System.out.println(a);
	System.out.println(a[0]);
	for(int i=0; i<5; i++){
	if (a[i]=='h')
	System.out.println("found h");
	System.out.println(a[i]);
	}
	}
  }
}