//2Dimensional Array.

class Test{
  public static void main(String[] args){
	int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
	for(int i=0; i<3; i++){
	for(int j=0; j<3; j++){
	System.out.print(a[i][j]);
	}
	System.out.println(" ");
	}
  }
}
class Test1{
  public static void main(String[] args){
	char c[][] = {{'a','b','c'},{'e','f','g','h'},{'i','j','k','l'}};
	for(int i=0; i<3; i++){
	for(int j=0; j<3; j++){
	System.out.print(c[i][j]);
	}
	System.out.println(" ");
	}
  }
}
import java.util.Scanner;
class Test2{
  public static void main(String args[]){
	int a[][] =new int[3][5];
	Scanner sc = new Scanner(System.in);
	for(i=0; i<3; i++){
	System.out.println("Enter number");
	a[i] = sc.nextInt();
	}
	for(j=0; j<5; j++){
	System.out.println("Enter number");
	a[j] = sc.nextInt();
	}
	for(i=0; i<3; i++){
	for(j=0; j<5; j++){
	System.out.print(a[i][j]);
	}
	System.out.println(" ");
	}
  }
}



