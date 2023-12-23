
import java.util.Scanner;
public class H37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int rev =0;
        int c = num;
        while(num!=0){
            int digit = num%10;
            rev = rev*10+digit;
            num = num/10;
        }
        if(c==rev){
            System.out.println("It is palindrome number = "+rev);
        }
        else{
            System.out.println("It is not palindrome number = "+rev);
        }
    }
}
