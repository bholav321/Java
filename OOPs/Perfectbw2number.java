//49) WAP to find out all the perfect numbers between two entered numbers
import java.util.Scanner;
public class Perfectbw2number {
    public void perfectnumber(int num1,int num2){
        for(int i=num1; i<=num2; i++){
            int sum=0;
            for(int j=1; j<i; j++){
                if(i%j==0){
                    sum = sum+j;
                }
            }
            if(i==sum){
                System.out.println("Perfect Number : "+sum);
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
        Perfectbw2number obj = new Perfectbw2number();
        obj.perfectnumber(num1, num2);
    }
}