//53) WAP to print all the strong numbers between two entered numbers
import java.util.Scanner;
public class Strongbw2number {
    public void strongnumber(int num1, int num2){
        for(int i=num1; i<=num2; i++){
            int c = i;
            int sum =0;
            while(c!=0){
                int fact=1;
                int digit = c%10;
                c = c/10;
                for(int j=1; j<=digit; j++){
                    fact = fact*j;
                }
                sum = sum+fact;
            }
            if(i==sum){
                System.out.println(sum);
            }
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
        Strongbw2number obj = new Strongbw2number();
        obj.strongnumber(num1, num2);
    }
}
