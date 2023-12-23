import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three digit no...");
	int num = sc.nextInt();
	int rev = 0, a = 1;
	int sum = 0;
	int c = num;
	while(num!=0){
	int digit = num%10;
	rev = rev*10 + digit;
	num = num/10;
	a = digit*digit*digit;
	sum = a+sum;
	}
	if (c==sum)
	System.out.println("No. is Armstrong");
	else
	System.out.println("No. is not Armstrong");
  }

}