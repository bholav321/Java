import java.util.Scanner;

class H9{
  public static void main(String[] arg){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an integer no.");
	int n = sc.nextInt();
	int i = 1;
	for(i=1; i<=n ; i++){
	if(i%2==0)
	System.out.println(i);
	} 
  }
}