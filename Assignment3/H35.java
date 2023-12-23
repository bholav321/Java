import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int i=1,rev = 0,a = 0;
	int c = num;
	while(num!=0){
	int digit = num%10;
	rev = rev*10+digit;
	num = num/10;
	a = digit+a;
	}	
	//System.out.println(rev);
	//System.out.println(a);
	if (c==rev)
	System.out.println("No. is palindrome "+rev);
	else
	System.out.println("No. is not palindrome"+rev);
	
  }

}