//36) WAP to reverse a number
import java.util.Scanner;
public class Reversenumber {
    public int reverse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        int rev=0;
        while(num!=0){
            int digit = num%10;
            num = num/10;
            rev = rev*10+digit;
            
        }
        return rev;
    }    
}
class Testmain{
    public static void main(String[] args){
        Reversenumber obj = new Reversenumber();
        int result = obj.reverse();
        System.out.println(result);
    }
}
