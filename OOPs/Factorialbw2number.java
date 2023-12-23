//56) WAP to print factorial of all the numbers between two entered numbers
import java.util.Scanner;
public class Factorialbw2number {
    public void fact1(int num1, int num2){
        for(int i=num1; i<=num2; i++){
            int fact = 1;
            for(int j=1; j<=i; j++){
                fact = fact*j;
            }
            System.out.println("Factorial of "+i+" is "+fact);
        }
    }
}
class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number ");
        int num2 = sc.nextInt();
        Factorialbw2number obj = new Factorialbw2number();
        obj.fact1(num1, num2);
    }
}
