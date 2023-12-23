import java.util.Scanner;

public class Que7 {
    public int reverse(int num){
        int rev = 0;
        while(num!=0){
            int digit = num%10;
            rev = rev*10+digit;
            num = num/10;
        }
        return rev;
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        Que7 obj = new Que7();
        System.out.println("Reverese number : "+obj.reverse(num));
    }
}