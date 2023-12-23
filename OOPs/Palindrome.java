//37) WAP to check whether entered number is palindrome or not
import java.util.Scanner;
public class Palindrome {
    public void palindrome1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        int rev = 0;
        int c = num;
        while(num!=0){
            int digit = num%10;
            rev = rev*10+digit;
            num = num/10;
        }
        if(c==rev){
            System.out.println(rev+" is a palindrome number ");
        }
        else{
            System.out.println(rev+" is not a palindrome number");
        }
        
    }  
}
class Testmain{
    public static void main(String[] args){
        Palindrome obj = new Palindrome();
        obj.palindrome1();
    }
}