import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i=1,sum=0;
	System.out.println("Enter the number");
	int n = sc.nextInt();
	int c = n;
	while(n!=0){
	int digit = n%10;
	int fact=1;
	for(i =1 ; i<=digit; i++){
	fact = fact*i;
	}
	sum = sum+fact;
	n = n/10;
	}
	System.out.println(sum);
	if (c==sum)
	System.out.println("Strong no...");
	else
	System.out.println("Not Strong no...");

  }

}