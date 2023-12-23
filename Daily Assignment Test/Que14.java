import java.util.Scanner;


public class Que14 {
    public void factorial(int num){
        int fact =1;
        for(int i=1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        Que14 obj = new Que14();
        obj.factorial(num);
    }
}
