import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i = 1;
	System.out.println("Enter a number");
	int n = sc.nextInt();
	for (i = 1; i<=n; i++){
	if (i%2==1)
	System.out.println(i*i);
	}
 
  }

}