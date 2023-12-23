//54) WAP to print all the even numbers between two entered numbers
import java.util.Scanner;
public class Evenbw2number {
    public void evennumebr(int num1, int num2){
        for(int i=num1; i<=num2; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        Evenbw2number obj = new Evenbw2number();
        obj.evennumebr(num1, num2);
    }
}