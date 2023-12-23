//7) WAP to check whether entered number is prime or not.
import java.util.Scanner;

public class Prime {
    public void primenumber(int a){
        boolean flag = true;
        for(int i=2; i<a/2; i++){
            if(a%i==0){
                flag = false;
                System.out.println(a+" is not a prime number ");
                break;
            }
        }
        if(flag){
            System.out.println(a+" is a prime number ");
        }
    }
}
class Testmain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Prime obj = new Prime();
        System.out.println("Enter a number ");
        int a = sc.nextInt();
        obj.primenumber(a);
    }
}
