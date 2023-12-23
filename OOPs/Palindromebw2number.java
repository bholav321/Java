//50) WAP to find out all the palindrome numbers between two entered numbers
import java.util.Scanner;
public class Palindromebw2number {
    public void palindrome(int num1, int num2){
        
        for(int i=num1; i<=num2; i++){
            int rev = 0;
            int c = i;
            while(c!=0){
                int digit = c%10;
                rev = rev*10+digit;
                c = c/10;
            }
            if(i==rev){
                System.out.println(rev);
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
        Palindromebw2number obj = new Palindromebw2number();
        obj.palindrome(num1, num2);
    }
}
