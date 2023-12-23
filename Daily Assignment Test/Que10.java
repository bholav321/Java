import java.util.Scanner;

public class Que10 {
    public void fibonacci(int num){
        int a=-1,b=1,c;
        for(int i=1; i<=num; i++){
            c = a+b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        Que10 obj = new Que10();
        obj.fibonacci(num);
    }
}
