import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i=1,even = 0, odd = 0;
	int n = sc.nextInt();
	while(n!=0){
	int digit = n%10;
	if (digit%2==0)
	even = even+1;
	else 
	odd = odd+1;
	n = n/10;
	}
	System.out.println("Even digit ="+even);
	System.out.println("Odd digit ="+odd);
  }
}
	