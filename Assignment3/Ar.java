import java.util.Scanner;
class Test{
  public static void main(String[] args){
	int a[] = new int[5];
	Scanner sc = new Scanner(System.in);
	for(int i=1; i<5; i++){
	System.out.println("Enter number");
	a[i] = sc.nextInt();
	}
	for(int i=1; i<5; i++){
	System.out.println("Number="+a[i]);
	}
	}
  }
