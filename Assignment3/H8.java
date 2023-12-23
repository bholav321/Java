import java.util.Scanner;

class H8{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	// int num = sc.nextInt();
	// int i = 1;
	// int a = -1, b = 1, c;
	// for(i=1 ; i<=num ; i++){
	// c = a+b;
	// a = b;
	// b = c;
	// System.out.println(c);
	// }
	int num = sc.nextInt();
	int count = 0;
	while (num!=0) {
		num = num/10;
		count++;
	}
	System.out.println("Number of Count : "+count);
  }
}