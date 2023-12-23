//38) WAP to check whether entered number is Armstrong or not
import java.util.Scanner;
public class Armstrong {
    public void arms(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        int rev = 0;
        int c = num;
        if(num>=100 && num<=999){
            int sum = 0;
           while(num!=0){
            int digit = num%10;
            num = num/10;
            sum = digit*digit*digit+sum;
           }
           if(c==sum){
            System.out.println(sum+ " is a Armstrong number");
            } 
            else{
                System.out.println(sum+" is not a Armstrong number");
            }
        }       
    }
}
class Testmain{
    public static void main(String[] args){
        Armstrong obj = new Armstrong();
        obj.arms();
    }
}