import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i=1;
	int c = n;
	int a = 0;
	for(i = 1; i<=n/2; i++){
	if (n%i==0)
	a = a + i;
	}
	System.out.println(a);
	if(c==a)
	System.out.println("Perfect no.");
	else
	System.out.println("Not a perfect no.");
  }

}