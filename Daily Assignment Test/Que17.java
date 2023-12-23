import java.util.Scanner;

public class Que17 {
    public void amrstrong(int num){
        int rev=0;
        int c = num;
        while(num!=0){
            int digit=num%10;
            rev = rev+digit*digit*digit;
            num = num/10;
        }
        if(c==rev){
            System.out.println("Number is Armstrong ");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        Que17 obj = new Que17();
        obj.amrstrong(num);
    }
}
