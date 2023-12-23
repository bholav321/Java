import java.util.Scanner;

public class Fibonacci {
    public void fibonacci(int n){
        int a=-1,b=1,c;
        System.out.print("Fibonacci Series : ");
        for(int i=0; i<=n; i++){
            c = a+b;
            a = b;
            b = c;
            System.out.print(" "+c);
        }
    }
}
class Testmain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Fibonacci obj = new Fibonacci();
        obj.fibonacci(n);
    }
}