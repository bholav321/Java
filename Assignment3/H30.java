import java.util.Scanner;
	
class Test{
  public static void main(String[] args){
	Scanner  sc = new Scanner(System.in);
	System.out.println("Enter  a number");
	int i,j,sum=0;
	int a=1;
	int n = sc.nextInt();
	for (i = 1; i<=n; i++){
	System.out.println(a);
	sum = sum+a;
	a = a*10+1;
	}
	System.out.println(sum);
  }

}