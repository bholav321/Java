//57) WAP to print all the prime numbers between two entered numbers
import java.util.Scanner;
public class Primebw2number {
    public void primenumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number ");
        int num2 = sc.nextInt();
        int count = 0;
        for(int i=num1; i<=num2; i++){
            count=0;
            for(int j=2; j<=i; j++){
                if(i%j==0){
                    count++;
                }

            }
            if(count==1){
                System.out.println("Prime number : "+i);
            }
        }
    }  
}
class Test{
    public static void main(String[] args){
        Primebw2number obj = new Primebw2number();
        obj.primenumber();
    }
}