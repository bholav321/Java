//51) WAP to reverse all the numbers between two entered numbers
import java.util.Scanner;
public class Reversebw2number {
    public void reversenumber(int num1, int num2){
        for(int i=num1; i<=num2; i++){
            int c = i;
            int rev = 0;
            while(c!=0){
                int digit = c%10;
                rev = rev*10+digit;
                c = c/10;
            }
            System.out.println(rev);
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
        Reversebw2number obj = new Reversebw2number();
        obj.reversenumber(num1, num2);
    }
}
